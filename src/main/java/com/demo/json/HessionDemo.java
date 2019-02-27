package com.demo.json;

import com.demo.Person;

public class HessionDemo {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("mic");
        person.setAge(18);

        byte[] serialize = HessianSerializerUtil.serialize(person);
        Person person1 = HessianSerializerUtil.deserialize(serialize);

        System.out.println(person1);


    }
}
