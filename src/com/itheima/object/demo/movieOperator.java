package com.itheima.object.demo;

public class movieOperator {
    private Movie[] movies;

    public movieOperator(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 1.展示系统全部电影信息
     */
    public void printAllMovies() {
        System.out.println("电影名称\t\t电影导演\t\t电影主演\t\t电影价格\t\t电影评分\t\t电影简介");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("=======================");

        }
    }

    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println("该电影详情如下：");
                System.out.println("编号：" + m.getId());
                System.out.println("名称：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("评分：" + m.getScore());
                System.out.println("导演：" + m.getDirector());
                System.out.println("主演：" + m.getActor());
                System.out.println("简介：" + m.getInfo());
                return; // 结束方法
            }
        }
        System.out.println("没有找到编号为" + id + "的电影");
    }
}
