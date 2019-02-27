package com.demo.json;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.demo.Student;

import java.io.IOException;

public class JprotobufDemo {

    public static void main(String[] args) {

        Codec<Student> simpleTypeCodec = ProtobufProxy
                .create(Student.class);
        long start = System.currentTimeMillis();
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("mic");
        try {
            // 序列化
            byte[] bb = simpleTypeCodec.encode(stu);
            // 反序列化
            Student newStt = simpleTypeCodec.decode(bb);
            System.out.println("反序列化结果："+newStt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
