package com.example.simple_form;

import android.content.ContentValues;
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

    public boolean insertSomething(Bean bean) {
        try {
            ContentValues cvs;

            db = dataBase.getWritableDatabase();
            cvs = new ContentValues();
            cvs.put(Bean.NAME, bean.getName());
            cvs.put(Bean.LAST_NAME, bean.getLast_name());
            cvs.put(Bean.STATE, bean.getState());
            cvs.put(Bean.CITY, bean.getCity());
            cvs.put(Bean.ADDRESS, bean.getAddress());
            cvs.put(Bean.TELEPHONE, bean.getTelephone());
            cvs.put(Bean.CELLPHONE, bean.getCellphone());
            db.insert(Bean.TABLE_FORM, null, cvs);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return false;
    }

}
