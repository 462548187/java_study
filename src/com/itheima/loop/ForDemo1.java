package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("循环结束");

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            sum += i;

        }

        System.out.println("sum = " + sum);
    }
}