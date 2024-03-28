package com.itheima.object.javabean;

public class Student {
    private String name;
    private double Score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
