package com.itheima.object.javabean;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("张三");
        s1.setScore(90);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());


        StudentOperator so = new StudentOperator(s1);
        so.printPass();
    }
}
