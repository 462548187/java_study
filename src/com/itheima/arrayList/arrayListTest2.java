package com.itheima.arrayList;

import java.util.ArrayList;

public class arrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("红枸杞");
        list.add("白枸杞");

        for (int i = 0; i <list.size() ; i++) {

            String ele = list.get(i);

            System.out.println(ele);

            if (ele.contains("枸杞")) {
                list.remove(ele);
                i--;
            }

        }
        System.out.println(list);
    }

}
