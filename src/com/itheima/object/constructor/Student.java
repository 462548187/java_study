package com.itheima.object.constructor;

public class Student {
    String name;
    double score;
    public Student(){
        System.out.println("无参数构造被触发执行");
    }

    public Student(String name, double score){
        System.out.println("有参数构造被触发执行");
        this.name = name;
        this.score = score;
    }
}
