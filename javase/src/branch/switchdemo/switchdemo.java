package branch.switchdemo;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        //根据用户的输入性别来为用户推荐适合的书目
        rec();

        //根据今天的日期判断今天应该干什么
        day();
    }

    public static void rec(){
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();
        switch(sex){
            case"男":
                System.out.println("为您推荐《十日终焉》");
                break;
            case"女":
                System.out.println("为您推荐《从你的全世界路过》");
                break;
            default:
                System.out.println("性别输入错误");
        }
    }

    public static void day(){
        System.out.println("请输入今天的日期：");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        switch(day){
            case"星期一":
            case"星期二":
            case"星期三":
                System.out.println("今天是星期三，去跑步吧");
                break;
            case"星期四":
            case"星期五":
            case"星期六":
                System.out.println("今天是星期六，去约会吧");
                break;
            case"星期日":
                System.out.println("今天是星期日，去远足吧");
                break;
            default:
                System.out.println("日期输入错误");
        }
    }
}
