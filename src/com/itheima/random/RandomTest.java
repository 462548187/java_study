package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);

        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字：");
            int guessNum = sc.nextInt();

            if (guessNum > num) {
                System.out.println("你猜的数字" + guessNum + "大了");
            } else if (guessNum < num) {
                System.out.println("你猜的数字" + guessNum + "小了");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
            count++;
        }
        System.out.println("你一共猜了" + count + "次");



    }
}
