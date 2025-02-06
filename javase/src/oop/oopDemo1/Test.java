package oop.oopDemo1;

public class Test {
    public static void main(String[] args) {
        //打印两个学生的姓名和各科成绩，并且计算总成绩和平均成绩
        Stu s1 = new Stu();
        s1.name = "boniu";
        s1.Chiscore = 100;
        s1.Mathscore = 100;
        s1.printtotalscore();
        s1.printavgscore();

        Stu s2 = new Stu();
        s2.name = "boge";
        s2.Chiscore = 59;
        s2.Mathscore = 100;
        s2.printtotalscore();
        s2.printavgscore();

        Stu s3 = new Stu("boge", 59, 100);
        s3.printtotalscore();
    }
}
