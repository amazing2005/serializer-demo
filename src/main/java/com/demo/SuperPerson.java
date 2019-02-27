package com.demo;

import java.io.Serializable;

/**
 * 父类对象属性进行序列化的时候，要实现Serializable 接口
 */
public class SuperPerson implements Serializable{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
