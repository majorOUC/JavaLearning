package array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //构建一个数组来存储8个学生的成绩，并且输出成绩总和，最高分和最低分
        createarray();
    }

    public static void createarray(){
        double[] score = new double[8];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            score[i] = scan.nextDouble();
        }

        double totalscore = score[0];
        double max = score[0];
        double min = score[0];
        for(int i=1;i<score.length;i++){
            double tempt = score[i];
            totalscore += tempt;

            if(tempt>max){
                max = tempt;
            }
            if(tempt<min){
                min = tempt;
            }
        }
        System.out.println("总成绩为："+totalscore);
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
    }
}
