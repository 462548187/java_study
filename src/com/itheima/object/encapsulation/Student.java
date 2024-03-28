package com.itheima.object.encapsulation;

public class Student {

    private double score;

    public void setScore(double score){
        if (score < 0 || score > 100) {
            throw new RuntimeException("Invalid score");
        }
        this.score = score;
    }

    public double getScore(){
        return score;
    }

    public void printPass(){
        System.out.println(score >= 60 ? "Pass" : "Fail");
    }
}
