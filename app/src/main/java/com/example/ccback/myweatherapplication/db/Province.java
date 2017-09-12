package com.example.ccback.myweatherapplication.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ccback on 2017/9/12.
 */

public class Province extends DataSupport{
    private int id;
    private String privinceName;
    private int privinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrivinceName() {
        return privinceName;
    }

    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
