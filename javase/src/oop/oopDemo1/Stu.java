package oop.oopDemo1;

public class Stu {
    String name;
    int Chiscore;
    int Mathscore;

    //无参构造器
    public Stu(){
    }

    //有参构造器
    public Stu(String name, int Chinese, int Math){
        this.name = name;
        this.Chiscore = Chinese;
        this.Mathscore = Math;
    }



    public void printtotalscore(){
        System.out.println(name+"的总成绩是"+(Chiscore+Mathscore));
    }
    public void printavgscore(){
        System.out.println(name+"的平均成绩是"+(Chiscore+Mathscore)/2);
    }
}
