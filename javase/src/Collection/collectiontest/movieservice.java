package Collection.collectiontest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class movieservice {
    //电影操作类，用来存放电影集合和进行各种操作
    private static ArrayList<movie> allmovies = new ArrayList<>();

    //上架电影
    public static void addmovie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影名称：");
        String name = sc.next();
        System.out.println("请输入演员：");
        String actor = sc.next();
        movie m = new movie(name,actor);
        allmovies.add(m);
        System.out.println("当前的电影有：" + allmovies);
    }

    //下架某部电影
    public static void deletemovie(){
        System.out.println("请输入要下架的电影id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        allmovies.remove(id);
        System.out.println("当前的电影有：" + allmovies);
    }

    //查询所有电影
    public static void searchmovie(){
        Iterator<movie> it = allmovies.iterator();
        while(it.hasNext()){
            movie m = it.next();
            System.out.println("电影名称：" + m.getName() + " 主演：" + m.getActor());
        }
    }

    //下架某个演员的全部电影
    public static void deletemoviebyactor(String name){
        Iterator<movie> it = allmovies.iterator();
        while(it.hasNext()){
            movie m = it.next();
            if(m.getActor().contains(name)){
                it.remove();
            }
        }
        System.out.println("当前的电影有：" + allmovies);
    }

}
