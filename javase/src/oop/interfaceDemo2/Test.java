package oop.interfaceDemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建一个智能家居操作系统，控制空调、电视、洗衣机和冰箱的开和关
        Furnature[] f = new Furnature[4];
        f[0] = new Airconditioner("海尔空调", Status.OFF);
        f[1] = new TV("创维电视", Status.OFF);
        f[2] = new Lamp("欧灯", Status.OFF);
        f[3] = new Fridge("格力冰箱", Status.OFF);

        //创建一个智能家居控制对象来对各种家具进行操作
        Intelligenthomecontrol ihc = Intelligenthomecontrol.getInstance();

        while(true) {
            for (int i = 0; i < f.length; i++) {
                System.out.println((i+1) + f[i].getName() + "当前的状态是：" + f[i].getStatus());
            }
            System.out.println("请选择您要操作的设备(退出请输入exit)：");
            Scanner sc = new Scanner(System.in);
            String op = sc.next();
            switch(op){
                case "1":
                    ihc.press(f[0]);
                    break;
                case "2":
                    ihc.press(f[1]);
                    break;
                case "3":
                    ihc.press(f[2]);
                    break;
                case "4":
                    ihc.press(f[3]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
