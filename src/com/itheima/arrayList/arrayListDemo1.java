package com.itheima.arrayList;

import java.util.ArrayList;

public class arrayListDemo1 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // 输出集合
        System.out.println(list);

        // 添加元素
        list.add(1, "javaee");
        System.out.println(list);

        // 删除元素
        list.remove(1);
        System.out.println(list);

        // 获取元素
        String st = list.get(2);
        System.out.println(st);

        System.out.println(list.size());

        System.out.println(list.remove("java"));
    }
}
