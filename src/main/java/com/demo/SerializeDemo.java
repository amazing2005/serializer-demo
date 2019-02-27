package com.demo;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        serializePerson();
        //序列化不保存静态变量的状态
        Person.gender = 2;
        deSerializePerson();
    }


    private static void serializePerson() {
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("person")));
            Person person = new Person();
            person.setAge(18);
            person.setName("mic");
            oo.writeObject(person);
            oo.flush();
            oo.writeObject(person);
            oo.flush();
            System.out.println("序列化成功"+new File("person").length());
            //-----------------------
            // 重复保存对象的时候，保存的是对象的引用
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));
            Person person1 = (Person) inputStream.readObject();
            Person person2 = (Person) inputStream.readObject();
            System.out.println(person1==person2);
            //---------------------------
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void deSerializePerson() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));
            Object o = inputStream.readObject();
            if (o instanceof Person) {
                Person person = (Person) o;
                System.out.println(person.getAge()+","+ person.gender);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
