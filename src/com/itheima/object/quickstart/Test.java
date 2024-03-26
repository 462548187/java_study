package com.itheima.object.quickstart;

public class Test {
    public static void main(String[] args) {

        // Create one Student objects
        Student s1 = new Student();
        s1.name = "张三";
        s1.Chinese = 90;
        s1.Math = 80;
        s1.printTotalScore();
        s1.printAverageScore();

        // Create another Student object
        Student s2 = new Student();
        s2.name = "李四";
        s2.Chinese = 85;
        s2.Math = 95;
        s2.printTotalScore();
        s2.printAverageScore();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

}
