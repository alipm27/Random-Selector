package com.example.randomselector.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Data {
/*
this is table for data
 */
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ctName")
    private String ctName;

    @ColumnInfo(name = "data")
    private String data;

    public Data() {
    }

    public Data(int id, String ctName, String data) {
        this.id = id;
        this.ctName = ctName;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
