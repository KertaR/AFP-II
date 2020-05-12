package com.example.lof;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class BoltFragment extends Fragment {

    private static final String ARG_PARAM1="param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public BoltFragment(){
    }

    public static BoltFragment newInstance(String param1, String param2)
    {
        BoltFragment fragment = new BoltFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,param1);
        args.putString(ARG_PARAM2,param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_bolt,container,false);
        Button skin = (Button)view.findViewById(R.id.button17);
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkin();
            }
        });
        return view;
    }

    private void openSkin(){
        Intent skins = new Intent(getContext(),Bolt2Fragment.class);
        startActivity(skins);
    }
}