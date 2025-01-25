package ouc.wangmengzhe.instance;

import java.util.Scanner;

public class simplecalc {
    public static void main(String[] args) {
        //设计一个简单计算器，从控制台读取用户输入的数字和运算符并且输出结果
        System.out.println("请输入两个数字和运算符:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String op = sc.next();
        System.out.println(num1+op+num2+"="+calc(num1,num2,op));
    }

    //计算器实现方法
    public static double calc(double num1, double num2, String op){
        double result = 0;
        switch(op){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("请重新输入数字和运算符，并且注意运算符的正确性！");
        }
        return result;
    }
}
