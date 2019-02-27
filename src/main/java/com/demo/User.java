package com.demo;

import java.io.Serializable;

public class User extends SuperPerson implements Serializable{


    private static final long serialVersionUID = 1362833492159178974L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
