package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(100);
            System.out.println(a);
        }


        for (int i = 0; i < 5; i++) {
            int b = r.nextInt(50) + 50;
            System.out.println("输出b的值："+b);
        }

    }


}
