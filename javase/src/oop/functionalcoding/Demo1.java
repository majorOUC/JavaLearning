package oop.functionalcoding;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        //使用函数式编程，同时学会使用静态方法引用、实例方法引用、构造器引用、特殊类型引用来进一步简化代码
        //创建一个包含十个英文名字的字符串数组
        String[] students = {"Andy", "Bob", "Candy", "Daisy", "Eric", "awo", "gEis", "Helen", "baba", "zangyingying"};

        //请按照首字母升序的顺序对数组中的元素进行排序，同时在排序的过程中忽略大小写
        //Arrays.sort(students, (o1, o2) -> o1.compareToIgnoreCase(o2));

        Arrays.sort(students, String::compareToIgnoreCase);//使用特殊类型引用进一步简化匿名内部类


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //匿名内部类
        carFactory cf = new carFactory() {
            @Override
            public car createCar(String name) {
                return new car();
            }
        };

        //可以使用构造器引用来进一步简化这个匿名内部类
        carFactory cf2 = car::new;

        car xiaomi = cf2.createCar("su7");
        xiaomi.run();
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class car{
    private String name;
    public void run(){
        System.out.println(this.name + " is running");
    }
}

interface carFactory{
    car createCar(String name);
}
