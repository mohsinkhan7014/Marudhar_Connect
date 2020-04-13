package com.mohsin.marudhar_connect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Student extends AppCompatActivity {

    CardView studentd,addst,cgpa,exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        studentd=findViewById(R.id.card_view);
        addst=findViewById(R.id.card_view2);
        cgpa=findViewById(R.id.card_view3);
        exam=findViewById(R.id.card_view4);

        studentd.setRadius(20);
        addst.setRadius(20);
        cgpa.setRadius(20);
        exam.setRadius(20);

        studentd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(Student.this,Details.class);
                startActivity(ii);
            }
        });


        addst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(Student.this,addStudent.class);
                startActivity(ii);
            }
        });

        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(Student.this,cgpa.class);
                startActivity(ii);
            }
        });


    }
}
