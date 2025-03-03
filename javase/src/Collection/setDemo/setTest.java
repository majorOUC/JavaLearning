package Collection.setDemo;

import java.util.HashSet;
import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        //hashset的去重操作
        Set<Student> set = new HashSet<>();
        set.add(new Student("张三", 18, 100));
        set.add(new Student("李四", 19, 99));
        set.add(new Student("王五", 20, 98));
        set.add(new Student("张三", 18, 100));

        System.out.println(set);
    }
}
