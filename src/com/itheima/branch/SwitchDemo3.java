package com.itheima.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {

        int a = 10;
        double b = 0.2;
        double b1 = 0.1;
        double c = b + b1;
        System.out.println(c);


        int i =20;
        int j = 30;

        int h = i + j;

        switch (h) {

            case 20:
                System.out.println("a=20");
                break;
            case 50:
                System.out.println("a=50");
                break;

            default:
                System.out.println("没有匹配的值");
        }

    }

}
