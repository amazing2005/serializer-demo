package com.demo;

import java.io.*;

public class SuperPersonDemo {

    public static void main(String[] args) {
        serializePerson();
        //序列化不保存静态变量的状态
        Person.gender = 2;
        deSerializePerson();
    }


    private static void serializePerson() {
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("person")));
            User person = new User();
            person.setAge(18);
            person.setName("mic");
            oo.writeObject(person);
            System.out.println("序列化成功");
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void deSerializePerson() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));
            Object o = inputStream.readObject();
            if (o instanceof User) {
                User person = (User) o;
                System.out.println(person.getAge()+","+person.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
