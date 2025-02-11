package oop.interfaceDemo2;

public class Airconditioner extends Furnature{
    public Airconditioner(String name, Status status) {
        super(name, status);
    }

    public void aircon(){
        System.out.println("正在帮您跳转小米空调官方app，进行温控等操作。。。。。。");
    }
}
