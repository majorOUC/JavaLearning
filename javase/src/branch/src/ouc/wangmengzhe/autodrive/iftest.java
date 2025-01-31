package ouc.wangmengzhe.autodrive;

public class iftest {
    public static void main(String[] args) {
        test();
    }

    //设计一个自动驾驶汽车的红绿灯判别系统
    public static void test(){
        boolean red = true;
        boolean green = false;
        boolean yellow = false;

        if(red){
            System.out.println("红灯亮了还走你是不是der");
        }else if(yellow){
            System.out.println("黄灯亮了准备驶入待转区");
        }else if(green){
            System.out.println("绿灯亮了快冲！！！");
        }else{
            System.out.println("这个红绿灯坏了，请驾驶员接管");
        }

    }

}
