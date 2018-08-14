package com.example.sackerman.popularmovies.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sackerman.popularmovies.Data.Contract;



public abstract class DatabaseHelper extends SQLiteOpenHelper {

    DatabaseHelper (Context context){
        super(context, Contract.MOVIES_DATABASE, null, Contract.DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        /*Builds Tables in Database. Gets a writeable Datase if one does not exist.  */

        final String SQl_MOVIE_TABLE = "CREATE TABLE" + Contract.MOVIE_NAME_TABLE
        // Set MOVIE_ID field, inherited from BaseColumns, as table primary key




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
