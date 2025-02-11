package oop.interfaceDemo2;

public class Lamp extends Furnature{
    public Lamp(String name, Status status){
        super(name,status);
    }

    public void lamp(){
        System.out.println("正在为您跳转欧灯官方app，进行色调转换等操作。。。。。。");
    }
}
