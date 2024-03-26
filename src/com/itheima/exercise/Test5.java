package com.itheima.exercise;

public class Test5 {
    public static void main(String[] args) {
        // 目标：掌握数组拷贝
        int[] arr = {11, 2, 3, 4, 5};
        int[] newArr = copyArray(arr);
        printArray(newArr);
        printArray(arr);

        arr[1] = 100;
        System.out.println("修改后的arr数组："+arr[1]);
        System.out.println("修改后的newArr数组："+newArr[1]);

    }

    public static int[] copyArray(int[] arr) {
        // 创建一个新的数组，长度和arr数组一样
        int[] newArr = new int[arr.length];

        // 遍历arr数组，将每个元素拷贝到newArr数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void printArray(int[] arr) {
        // 遍历数组，打印每个元素
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ",");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");

        }
        System.out.println("]");
    }
}
