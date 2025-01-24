package ouc.wangmengzhe.inoutputdemo;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int num = getInt();
        System.out.println(num);
    }

    //帮我写一个方法，获取用户的int输入
    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        return num;
    }
}
