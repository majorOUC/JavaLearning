package oop.interfaceDemo2;

import java.util.Scanner;

public class function {
    //方法类，单独集成各种方法
    public static void op1(Intelligenthomecontrol ihc, Furnature[] f){
        while(true) {
            for (int i = 0; i < f.length; i++) {
                System.out.println((i + 1) + f[i].getName() + "当前的状态是：" + f[i].getStatus());
            }
            System.out.println("请选择您要操作的设备(退出请输入exit)：");
            Scanner sc = new Scanner(System.in);
            String op = sc.next();
            switch (op) {
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
