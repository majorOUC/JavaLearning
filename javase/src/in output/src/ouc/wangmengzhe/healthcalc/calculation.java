package ouc.wangmengzhe.healthcalc;

import java.util.Scanner;



public class calculation {
    public static void main(String[] args) {
        System.out.println("Please inter your age:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("Please inter your sex(male or female):");
        String sex = scan.next();
        System.out.println("Please inter your height(cm):");
        double height = scan.nextDouble();
        System.out.println("Please inter your weight(kg):");
        double weight = scan.nextDouble();

        System.out.println("Your bmi is:" + bmi(height, weight));
        System.out.println("Your bmr is:" + bmr(age, sex, height, weight));
    }

    //设计一个方法，计算用户的bmi
    public static double bmi(double height, double weight){
        double bmi = weight/(height*height);
        return bmi;
    }

    //设计一个方法，计算用户的bmr
    public static double bmr(int age, String sex, double height, double weight){
        double bmr = 0;
        if(sex.equals("male")){
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
            return bmr;
        }
        else if(sex.equals("female")){
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
            return bmr;
        }
        else{
            System.out.println("Please inter your sex(male or female):");
            return 0;
        }
    }
}
