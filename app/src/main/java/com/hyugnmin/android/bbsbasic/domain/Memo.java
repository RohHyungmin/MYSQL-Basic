package com.hyugnmin.android.bbsbasic.domain;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by pc on 2/14/2017.
 */

@DatabaseTable(tableName = "memo")
public class Memo {

    @DatabaseField(generatedId = true)
    int id;

    @DatabaseField
    String memo;

    @DatabaseField
    Date date;

    public Memo(){
        // default
    }

    // create 시에 사용할 생성자
    public Memo(String memo, Date date){
        this.memo = memo;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}