package oop.finalinstance;

import java.util.Scanner;

public class ServiceMachine {
    //一个静态类，用来提供充值和消费的服务

    //消费的静态方法
    public static void pay(Card c){
        System.out.println("您该次消费的金额为：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }

    //充值的静态方法
    public static void deposit(Card c){
        System.out.println("您该次充值的金额为：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.deposit(money);
        System.out.println("充值成功！您的余额为：" + c.getBalance());
    }
}
