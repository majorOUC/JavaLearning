package oop.interfaceDemo2;

public class Intelligenthomecontrol {
    //创造一个智能家居控制的单例类
    private static final Intelligenthomecontrol instance = new Intelligenthomecontrol();

    //构造器私有
    private Intelligenthomecontrol(){
    }

    public static Intelligenthomecontrol getInstance(){
        return instance;
    }

    public void press(Furnature f){
        System.out.println(f.getName() + "当前的状态为：" + (f.getStatus() == Status.ON ? "开着" : "关着"));
        System.out.println("按下了开关");
        f.operate(f);
        System.out.println(f.getName() + "当前的状态为：" + (f.getStatus() == Status.ON ? "开着" : "关着"));
    }
}
