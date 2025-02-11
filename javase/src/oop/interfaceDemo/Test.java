package oop.interfaceDemo;

public class Test {
    public static void main(String[] args) {
        //接口小案例：设计一个学生成绩管理系统，学生信息包括学生的姓名，性别和成绩。
        //要求该系统要实现两个功能：统计班级中的学生总人数，计算班级中的平均分
        //但是要实现两套方案：第一套就是上述的方案，第二套是统计总人数的同时还要统计男生和女生的人数，并且在计算平均成绩的时候去掉最高分和最低分

        Student[] student = new Student[10];

        student[0] = new Student("张三", '男', 100);
        student[1] = new Student("李四", '女', 90);
        student[2] = new Student("王五", '男', 80);
        student[3] = new Student("赵六", '女', 70);
        student[4] = new Student("钱七", '男', 60);
        student[5] = new Student("孙八", '女', 50);
        student[6] = new Student("周九", '男', 40);
        student[7] = new Student("吴十", '女', 30);
        student[8] = new Student("郑十一", '男', 20);
        student[9] = new Student("冯十二", '女', 10);

        inf service = new plan2();
        service.count(student);
        service.average(student);

    }
}
