package com.example.randomselector.db;
/*
this class make database
 */
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.randomselector.model.Category;
import com.example.randomselector.model.Data;

@Database(entities = {Data.class, Category.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract IDao idao();

    private static AppDatabase instance= null;

    public static synchronized AppDatabase getInstance(Context context){

        if (instance==null){
            instance= Room.databaseBuilder(context,AppDatabase.class,"randomSelectorDb").allowMainThreadQueries().build();
        }
        return instance;
    }
}
