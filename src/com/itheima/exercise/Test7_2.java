package com.itheima.exercise;

public class Test7_2 {
    public static void main(String[] args) {

        int ct = getSearch(101, 200);
        System.out.println("一共有" + ct + "个质数");

    }

    public static int getSearch(int start, int end) {
        int count = 0;

        OUT:
        // 外部循环的标签
        for (int i = start; i <= end; i++) {


            for (int j = 2; j < end / 2; j++) {
                if (i % j == 0) {
                    continue OUT; // 跳到外部循环
                }

            }

            System.out.println(i);
            count++;

        }
        return count;
    }
}
