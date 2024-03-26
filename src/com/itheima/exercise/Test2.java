package com.itheima.exercise;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        String code = createCode(6); // 生成一个长度为10的随机字符串
        System.out.println("验证码：" + code);

    }

    public static String createCode(int length) {
        // 创建一个长度为length的随机字符串

        Random random = new Random();

        String code = "";

        for (int i = 1; i <= length; i++) {
            // 随机生成一个数字或者字母
            int type = random.nextInt(3);

            switch(type){
                case 0:
                    // 生成一个数字
                    code += random.nextInt(10);
                    break;
                case 1:
//                  // 生成一个大写字母
                    char ch1 = (char) (random.nextInt(26) + 65);
                    code += ch1;
                    break;

                case 2:
                    // 生成一个小写字母
                    char ch2 = (char) (random.nextInt(26)+97);
                    code += ch2;
                    break;


            }

        }
//        System.out.println(code);
        return code;
    }
}
