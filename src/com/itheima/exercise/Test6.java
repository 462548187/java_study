package com.itheima.exercise;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        int[] moneys = {5, 10, 20, 50, 100, 200};

        start(moneys);

    }

    public static void start(int[] moneys){

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        for (int i = 0; i <= 5; i++) {
            System.out.println("请您输入任意内容进行抽奖：");

            sc.next();

            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];

                if (money !=0) {
                    System.out.println("恭喜您抽中了" + money + "元大奖！");
                    moneys[index] = 0;
                    break;
                }
            }

        }
        System.out.println("抽奖结束！");
    }
}
