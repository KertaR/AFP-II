package com.example.lof.database;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lof.MainActivity;
import com.example.lof.R;

public class InsertData extends AppCompatActivity {
    EditText t1,t2;

    public void addRecord(){
        DatabaseHelper helper = new DatabaseHelper(this);
        String result = helper.addRecord("sajtos","jelszo",null,0);
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        t1.setText("");
        t2.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
    }
}
