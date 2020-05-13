package com.example.lof;

import android.os.Build;
import android.os.Bundle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.lof.controllers.UserHandler;

import java.util.Objects;

public class ProfilFragment extends Fragment
{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ProfilFragment(){

    }

    public static ProfilFragment newInstance(String param1, String param2)
    {
        ProfilFragment fragment = new ProfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if(getArguments() != null)
        {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_profil,container,false);
        TextView tw = (TextView)v.findViewById(R.id.textFelhasznalo);
        tw.setText(UserHandler.database.userDao().getUsername(UserHandler.getSessionid()));
        TextView tw2 = (TextView)v.findViewById(R.id.textSzint);
        tw2.setText("Szint: " + String.valueOf(UserHandler.database.userDao().getExperience(UserHandler.getSessionid())));
        return v;
    }
}
