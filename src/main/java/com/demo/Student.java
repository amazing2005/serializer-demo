package com.demo;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;

public class Student{

    private static final long serialVersionUID = -2140242550063332020L;

    @Protobuf(fieldType = FieldType.INT32, order = 1, required = true)
    private  int age;

    @Protobuf(fieldType = FieldType.STRING, order = 2, required = false)
    private  String name;

    public static int gender = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
