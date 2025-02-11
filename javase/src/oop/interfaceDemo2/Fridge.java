package oop.interfaceDemo2;

import java.util.Scanner;

public class Fridge extends Furnature{
    private double temperature;
    public Fridge(String name, Status status){
        super(name,status);
    }

    public void turntemp(){
        System.out.println("当前的温度是" + temperature);
        System.out.println("请输入您想要跳转的温度：");
        Scanner sc = new Scanner(System.in);
        temperature = sc.nextDouble();
        System.out.println("温度跳转成功，当前的温度为：" + temperature);
    }
}
