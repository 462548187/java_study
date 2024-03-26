package com.itheima.exercise;

public class Test8 {
    public static void main(String[] args) {
        // 99乘法表
        for (int i = 1; i <= 9 ; i++) {

            for (int j = 1; j <i ; j++) {
                // j 是列数 i 是行数

                System.out.print(j + " X " + i + " = " + j * i + "\t\t");

            }
            System.out.println();
            System.out.println();

        }
    }
}
