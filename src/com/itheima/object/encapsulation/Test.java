package com.itheima.object.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.score = 90;
        s1.setScore(90);
        System.out.println(s1.getScore());
    }
}
