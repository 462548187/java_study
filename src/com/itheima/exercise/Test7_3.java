package com.itheima.exercise;

public class Test7_3 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i < 200; i++) {

            if(check(i)){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("一共有" + count + "个质数");
    }

    public static boolean check(int num){
        for (int i = 2; i < num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
