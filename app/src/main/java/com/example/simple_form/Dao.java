package com.example.simple_form;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Dao {
    private Context context;
    private Cursor cursor;
    private SQLiteDatabase db;
    private ConfigDB dataBase;

    public Dao(Context context) {
        this.context = context;
        dataBase = new ConfigDB(context);
        db = dataBase.getReadableDatabase();
    }
}
