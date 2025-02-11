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

        function.op1(ihc, f);

    }
}
