package com.itheima.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class foodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();

    public void addFood() {

        Scanner sc = new Scanner(System.in);

        Food food = new Food();

        System.out.println("请输入菜品名称：");
        food.setName(sc.next());


        System.out.println("请输入菜品价格：");
        food.setPrice(sc.nextDouble());

        System.out.println("请输入菜品描述：");
        food.setDesc(sc.next());

        foodList.add(food);
        System.out.println("添加成功！");
    }

    public void showFood() {
        if (foodList.size() == 0) {
            System.out.println("无菜品，请先添加！");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println("菜品名称：" + food.getName() + " 菜品价格：" + food.getPrice() + " 菜品描述：" + food.getDesc());
            System.out.println("-------------------------------");
        }
    }

    public void  start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.添加菜品");
            System.out.println("2.查看菜品");
            System.out.println("3.退出");
            System.out.println("请输入你的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }
}
