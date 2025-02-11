package oop.interfaceDemo2;

import java.util.Scanner;

public class TV extends Furnature{
    private int channel;

    public TV(String name, Status status){
        super(name, status);
    }

    public void tv(){
        System.out.println("当前的频道是" + channel);
        System.out.println("您想要跳转到：");
        Scanner sc = new Scanner(System.in);
        channel = sc.nextInt();
        System.out.println("跳转到" + channel + "频道");
    }
}
