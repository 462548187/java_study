package com.itheima.object.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create an array of Movie objects
        Movie[] movies = new Movie[5];
        movies[0] = new Movie(1, "战狼", 20, 8.0, "吴京", "吴京", "战狼战狼战狼");
        movies[1] = new Movie(2, "红海行动", 25, 9.0, "林超贤", "张译", "红海行动红海行动红海行动");
        movies[2] = new Movie(3, "唐人街探案", 30, 7.0, "陈思诚", "王宝强", "唐人街探案唐人街探案唐人街探案");
        movies[3] = new Movie(4, "战狼2", 22, 8.0, "吴京", "吴京", "战狼2战狼2战狼2");
        movies[4] = new Movie(5, "红海行动2", 27, 9.0, "林超贤", "张译", "红海行动2红海行动2红海行动2");

        // Create a movieOperator object
        movieOperator mo = new movieOperator(movies);

        // Display all movie information
        mo.printAllMovies();

        // Search for movie information by ID
        mo.searchMovieById(2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=========== 电影信息系统 ============");
            System.out.println("1.查看所有电影");
            System.out.println("2.根据编号查询电影");
            System.out.println("请输入操作命令：");


            switch (sc.nextInt()) {
                case 1:
                    mo.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入要查询的电影编号：");
                    int id = sc.nextInt();
                    mo.searchMovieById(id);
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
