package com.sn.logon.model;

public class Account {
    private int id;
    private String username;
    private String encryptedPassword;

    public Account(String un, String eps){
        this.username = un;
        this.encryptedPassword = eps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}
