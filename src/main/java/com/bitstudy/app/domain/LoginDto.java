package com.bitstudy.app.domain;

public class LoginDto {
   private String id;
   private String pw;
   private boolean rememberID;
   private boolean storeID;

    public LoginDto() {
    }

    public LoginDto(String id, String pw, boolean rememberID, boolean storeID) {
        this.id = id;
        this.pw = pw;
        this.rememberID = rememberID;
        this.storeID = storeID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean isRememberID() {
        return rememberID;
    }

    public void setRememberID(boolean rememberID) {
        this.rememberID = rememberID;
    }

    public boolean isStoreID() {
        return storeID;
    }

    public void setStoreID(boolean storeID) {
        this.storeID = storeID;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "id=" + id +
                ", pw=" + pw +
                ", rememberID=" + rememberID +
                ", storeID=" + storeID +
                '}';
    }
}