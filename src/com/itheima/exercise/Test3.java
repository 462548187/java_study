package com.itheima.exercise;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        float avg = getAvg(5);
        System.out.println("去掉一个最高分，去掉一个最低分，剩下的成绩平均分是：" + avg);

    }

    public static float getAvg(int number) {

        int [] score = new int[number];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {

            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            score[i] = scanner.nextInt();

            if (score[i] < 0 || score[i] > 100) {
                System.out.println("输入的成绩不合法，请重新输入");
                i--;
            }

        }

        int sum = 0;

        int max = score[0];
        int min = score[0];

        for (int j : score) {
            sum += j;

            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }
        }

        float avg = (float) (sum - max - min) / (score.length -2);

        return avg;
    }
}
