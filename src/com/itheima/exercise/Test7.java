package com.itheima.exercise;

public class Test7 {
    public static void main(String[] args) {

        int ct = getSearch(101, 200);
        System.out.println("一共有" + ct + "个质数");

    }

    public static int getSearch(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {

            boolean flag = true;

            for (int j = 2; j < end / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                System.out.println(i);
                count++;
            }

        }
        return count;
    }
}
