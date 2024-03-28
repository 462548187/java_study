package com.itheima.object.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 90);


        Student s2 = new Student("李四", 85);
        System.out.println(s2.name);
        System.out.println(s2.score);

        Teacher t1 = new Teacher();
    }

}
