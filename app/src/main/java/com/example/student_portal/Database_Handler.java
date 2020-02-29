package com.example.student_portal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database_Handler extends SQLiteOpenHelper {
    private static final int database_version=1;
    private static final String database_name="Sign_upmanger";
    private static final String Table="Sign_up";
    private static final String id="_id";
    private static final String First_name="First_name";
    private static final String Last_name="Last_name";
    private static final String email="email";
    private static final String phone="phone";
    private static final String pass="pass";
    private static final String sem="sem";
    public Database_Handler(Context context){
        super(context,database_name,null,database_version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        Log.d("create","create");
        String Create_Table="CREATE TABLE " + Table + " (" + id + " INTEGER PRIMARY KEY," + First_name + " TEXT NOT NULL," + Last_name + " TEXT NOT NULL,"+ sem + " INTEGER NOT NULL,"  + email + " TEXT NOT NULL," + pass + " TEXT NOT NULL," +  phone + " TEXT NOT NULL" + ")";
        db.execSQL(Create_Table);
        Log.d("create","create1");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldversion,int newversion){
        db.execSQL("DROP TABLE IF EXISTS "+Table);
        onCreate(db);
    }
    void adddata(Signup_data data){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(First_name,data.getFirst_name());
        value.put(Last_name,data.getLast_name());
        value.put(sem,data.getSem());
        value.put(email,data.getEmail());
        value.put(pass,data.getPass());
        value.put(phone,data.getPhone());
        db.insert(Table,null,value);
        db.close();
    }
    public int getvalue(){
        String query="SELECT * FROM " + Table;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(query, null);
        int value;
        if(cursor==null){
            value=0;
        }
        else {
            value = cursor.getCount();
        }
        cursor.close();
        return value;
    }
    void erase(){
        SQLiteDatabase db1=this.getWritableDatabase();
        onUpgrade(db1,1,2);
    }
}
