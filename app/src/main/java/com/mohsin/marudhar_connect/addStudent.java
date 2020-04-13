package com.mohsin.marudhar_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;

public class addStudent extends AppCompatActivity {


    Button submit;

    EditText regno, name, sem,sec;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        submit=findViewById(R.id.submit);
        regno=findViewById(R.id.et1);
        name=findViewById(R.id.et2);
        sem=findViewById(R.id.et3);
        sec=findViewById(R.id.et4);
        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Datahandler mm=new Datahandler(addStudent.this);
                mm.insert(Long.parseLong(regno.getText().toString()),name.getText().toString(),Long.parseLong(sem.getText().toString()),sec.getText().toString());
                finish();
            }
        });


    }
}
