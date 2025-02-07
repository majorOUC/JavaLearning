package oop.instance;

import java.util.Scanner;

public class MovieService {
    //业务类：业务类中存储对Movie对象的各种操作
    //在本案例中实现的操作是展示所有的电影信息和通过电影id查询电影信息
    private Movie[] movies;

    public void setMovies(Movie[] movies){
        this.movies = movies;
    }

    public void showmovies(){
        for(int i=0;i<movies.length;i++){
            Movie m = movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
    }

    public void Searchbyid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的电影id：");
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId()==id){
                System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
