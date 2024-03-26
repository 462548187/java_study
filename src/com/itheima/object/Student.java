package com.itheima.object;

public class Student {
    String name;
    double Chinese;
    double Math;

    public void printTotalScore() {
        System.out.println(name + "总分：" + (Chinese + Math));
    }

    public void printAverageScore() {
        System.out.println(name + "平均分：" + (Chinese + Math) / 2);
    }
}

