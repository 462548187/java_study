package com.itheima.exercise;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("加密后的结果：" + encrypt(9876));
    }

    public static String encrypt(int number) {
        // 1983
        // 1. 将数字拆分成个位数字
        int[] numbers = splitNumber(number);

        // 2. 将每个数字加上5，然后对10取余
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;

        }

        // 3. 将第一位和第四位交换，第二位和第三位交换
        reverse(numbers);

        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;

    }

    public static int[] splitNumber(int number) {

        int number_length = getNumberLength(number);
//        System.out.println(number_length);

        int[] numbers = new int[number_length];

        for (int i = 0; i < numbers.length; i++) {
//            int temp = number/(10^(number_length-i-1));
            int temp = (int) Math.pow(10, number_length - i - 1);
            numbers[i] = number / temp;
        }
        return numbers;

    }

    public static int[] reverse(int[] numbers) {

        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        return numbers;

    }

    public static int getNumberLength(int number) {
        if (number == 0) {
            return 1;
        }
        int length = 0;
        while (number != 0) {
            number /= 10;
            length++;
        }
        return length;
    }

}
