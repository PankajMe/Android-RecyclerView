package com.example.myrecyclerview;

public class NewUser {
    private String name;
    private String id;
    private String email;

    public NewUser(){

    }
    public NewUser(String name,String id,String email){
        this.name=name;
        this.id=id;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
