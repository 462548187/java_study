package com.itheima.object.quickstart;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.Chinese);
        System.out.println(s1.Math);



        Student s2 = new Student();
        s2.name = "张三";


        Student s3 = new Student();
        s3.name = "李四";

    }
}
