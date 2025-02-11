package oop.interfaceDemo;

public class plan1 implements inf {
    //实现第一套方案
    @Override
    public void count(Student[] s) {
        System.out.println("当前班级的总人数为" + s.length);
    }

    @Override
    public void average(Student[] s) {
        double sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i].getScore();
        }
        System.out.println("当前班级的平均成绩为" + sum / s.length);
    }
}
