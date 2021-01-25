package com.example.simple_form;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConfigDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "form_data";

    public ConfigDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String FORM_ = "CREATE TABLE FORM ( " +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT, " +
                "LAST_NAME TEXT, " +
                "STATE TEXT, " +
                "CITY TEXT, " +
                "ADDRESS TEXT, " +
                "TELEPHONE INTEGER, " +
                "CELLPHONE INTEGER " +
                " )";
        db.execSQL(FORM_);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
