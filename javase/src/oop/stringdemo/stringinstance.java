package oop.stringdemo;

import java.util.Scanner;

public class stringinstance {
    public static void main(String[] args) {
        //设计一个验证码生成器，生成一个随即位数的验证码，每一位可能是大写字母、小写字母和数组
        System.out.println("请输入验证码的位数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("验证码为："+getcode(n));
    }

    public static String getcode(int n){
        String database = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random()*database.length());
            code += database.charAt(index);
        }
        return code;
    }
}
