package com.mohsin.marudhar_connect;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.text.UnicodeSetSpanner;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Datahandler  extends SQLiteOpenHelper {

    private static final String mydatabase = "mydatabase";
    Context ct;

    public Datahandler(Context context) {

        super(context, mydatabase, null, 1);
        ct=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String s="create table student (regno Integer,name text,sem Integer,section text)";
        db.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<String> showdata() {
        Toast.makeText(ct,"Inside Show values",Toast.LENGTH_LONG).show();
        SQLiteDatabase db=getReadableDatabase();
        String s="select * from student";
        Cursor cr=db.rawQuery(s,null);
        ArrayList<String> a1=new ArrayList<>();
        while (cr.moveToNext())
        {
            int reg=cr.getInt(0);
            String name=cr.getString(1);
            int sem=cr.getInt(2);
            String sec=cr.getString(3);
            String s3="Registration no  is :"+reg+"\nName is : "+name+"\n EMail is :"+sem+"\nsection is :"+sec;
            a1.add(s3);

            Log.d("DATABASE", reg+" "+name+""+sem+""+sec);
        }
        return a1;
    }


    public void insert(Long reg1,String name1,Long sem1,String sec1)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("registration",reg1);
        cv.put("name",name1);
        cv.put("sem",sem1);
        cv.put("section",sec1);
        db.insert("student",null,cv);
        Toast.makeText(ct,"DAta inserted", Toast.LENGTH_LONG).show();

    }
    public Cursor getall_data()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cr=db.rawQuery("select * from student",null);
        return cr;

    }


}
