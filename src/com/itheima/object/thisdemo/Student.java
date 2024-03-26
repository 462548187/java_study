package com.itheima.object.thisdemo;

public class Student {

    double score;

    public void printThis() {
        System.out.println("this = " + this);
    }


    public void printPass(double score){
        if(this.score > score){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

}
