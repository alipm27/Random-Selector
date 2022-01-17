package com.example.randomselector.db;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.randomselector.model.Category;
import com.example.randomselector.model.Data;

import java.util.List;

/*
this is query interface
 */
@Dao
public interface IDao {

    @Insert
    long insertCategory(Category category);

    @Insert
    long insertData(Data data);

    

}
