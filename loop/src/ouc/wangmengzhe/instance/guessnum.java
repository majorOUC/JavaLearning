package ouc.wangmengzhe.instance;

import java.util.Random;
import java.util.Scanner;

public class guessnum {
    public static void main(String[] args) {
        //设计一个猜数字游戏，随机生成一个1-100之间的数字，从控制台读取用户输入的数字，如果用户输入的数字大于随机数，则输出"猜大了"，如果用户输入的数字小于随机数，则输出"猜小了"。直到用户猜对为止
        //这是一种生成随机数的方法
        int num = (int)(Math.random()*100+1);
        //这是另一种生成随机数的方法
        Random random = new Random();
        int num1 = random.nextInt(100)+1;


        guessnum(num);
    }

    //猜数字程序，设计一个死循环
    public static void guessnum(int num){
        while(true){
            System.out.println("请输入一个数字:");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();

            if(num1>num)
                System.out.println("猜大了");
            if(num1<num)
                System.out.println("猜小了");
            if(num1==num){
                System.out.println("猜对了");
                break;
            }
            }
        }


}
