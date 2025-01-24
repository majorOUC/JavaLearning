package ouc.wangmengzhe.whileloop;

public class whileloopdemo {
    public static void main(String[] args) {
        //学习while循环
        whileloop();

        System.out.println("-----------------");
        //使用while循环求银行投资多少年后，本金能翻倍问题
        bank();

        System.out.println("-----------------");
        //求一张纸折叠多少次后，可以达到珠穆朗玛峰的高度
        paper();

        System.out.println("-----------------");
        //打印四行五列*
        printstar();

        System.out.println("-----------------");
        //打印九九乘法表
        multi();
    }

    public static void whileloop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    //在银行投资100000元，银行每年的复利为1.7%，求投资多少年后，本金能翻倍？
    public static void bank() {
        double money = 100000;
        int year = 0;
        while(money<200000){
            money += money*0.017;
            year++;
        }
        System.out.println("年数为："+year);
    }

    //珠穆朗玛峰的高度是8848860毫米，假设一张纸的厚度是0.1毫米，求折叠多少次之后，可以折叠出珠穆朗玛峰的高度
    public static void paper() {
        double paper = 0.1;
        int moun = 8848860;
        int count = 0;
        while(paper<moun){
            paper *= 2;
            count++;
        }
        System.out.println("折叠了"+count+"次");
    }

    //打印四行五列*
    public static void printstar(){
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
        }
    }

    //做一个九九乘法表
    public static void multi(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

    }

}
