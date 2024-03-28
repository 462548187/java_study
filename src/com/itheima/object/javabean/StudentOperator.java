package com.itheima.object.javabean;

public class StudentOperator {
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass(){
        if (student.getScore() >= 60) {
            System.out.println(student.getName() + " is passed.");
        } else {
            System.out.println(student.getName() + " is failed.");
        }
    }
}
