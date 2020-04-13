package com.mohsin.marudhar_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Details extends AppCompatActivity {

    ListView lvsearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
       Datahandler mydatabase=new Datahandler(getApplicationContext());
        lvsearch=findViewById(R.id.lv);
        ArrayList<String>  al=mydatabase.showdata();
        ArrayAdapter<String> ad=new ArrayAdapter<>(getApplicationContext(),R.layout.abc,al);
        lvsearch.setAdapter(ad);





    }
}
