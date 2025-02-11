package oop.interfaceDemo2;

import java.util.Scanner;

public class function {
    //方法类，单独集成各种方法

    //总方法：启动循环询问用户是否操作并且持续展示设备状态
    //同时进入到该设备的个性化操作界面
    public static void op1(Intelligenthomecontrol ihc, Furnature[] f){
        while(true) {
            for (int i = 0; i < f.length; i++) {
                System.out.println((i + 1) + f[i].getName() + "当前的状态是：" + f[i].getStatus());
            }
            System.out.println("请选择您要操作的设备(退出请输入exit)：");
            Scanner sc = new Scanner(System.in);
            String op = sc.next();
            switch (op) {
                case "1"://这个是空调
                    ihc.press(f[0]);
                    Airconditioner a = (Airconditioner) f[0];
                    a.aircon();
                    break;
                case "2"://这个是电视
                    ihc.press(f[1]);
                    TV t = (TV) f[1];
                    t.tv();
                    break;
                case "3"://这个是灯
                    ihc.press(f[2]);
                    Lamp l = (Lamp) f[2];
                    l.lamp();
                    break;
                case "4"://这个是冰箱
                    ihc.press(f[3]);
                    Fridge f1 = (Fridge) f[3];
                    f1.turntemp();
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
