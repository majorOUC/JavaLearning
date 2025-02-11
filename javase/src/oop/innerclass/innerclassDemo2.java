package oop.innerclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Arrays;
import java.util.Comparator;

public class innerclassDemo2 {
    //匿名内部类的另一种应用场景-------使用comparator接口进行排序
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 1.75, '男');
        students[1] = new Student("李四", 19, 1.80, '男');
        students[2] = new Student("王五", 20, 1.70, '男');
        students[3] = new Student("赵六", 21, 1.65, '女');
        students[4] = new Student("钱七", 22, 1.60, '女');
        students[5] = new Student("孙八", 23, 1.55, '女');

        //按照年龄进行升序排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student{
    private String name;
    private int age;
    private double height;
    private char sex;
}
