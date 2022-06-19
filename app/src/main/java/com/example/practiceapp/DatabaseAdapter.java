package com.example.practiceapp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseAdapter extends SQLiteOpenHelper{

    public static final String db = "practicedb";
    public static final String table = "practicetable";
    public static final String col1 = "ID";
    public static final String col2 = "NAME";
    public static final String col3 = "ENROLLMENT";

    public DatabaseAdapter(@Nullable Context context) {
        super(context, db, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+table+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, ENROLLMENT TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+table);
        onCreate(sqLiteDatabase);
    }

    public boolean InsertData(String name,String enrollment){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col2,name);
        contentValues.put(col3,enrollment);

        long res = sqLiteDatabase.insert(table, null, contentValues);

        if (res == -1){
            return false;
        }else{
            return true;
        }
    }

    public Integer DeleteData(String id){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.delete(table, "id = ?", new String[]{id});
    }

    public boolean UpdateData(String id,String name,String enroll){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1,id);
        contentValues.put(col2,name);
        contentValues.put(col3,enroll);

        sqLiteDatabase.update(table, contentValues, "id = ?", new String[]{id});
        return true;
    }

    public Cursor getData(){
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor result = database.rawQuery("select * from "+table,null);
        return result;
    }
}
