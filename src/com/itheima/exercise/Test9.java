package com.itheima.exercise;

public class Test9 {
    public static void main(String[] args) {

        int n = 20;
        // 定义打印多少行
        for (int i = 1; i <= n; i++) {
            // 2、打印空格
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            //3、控制打印多少个星星
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            //4、换行
            System.out.println();

        }

        // 打印下半部分
        int n2 = n/2;

        for (int M = 1; M <= n2; M++) {

            for (int N = 1; N <= (n-1); N++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
    }
}
