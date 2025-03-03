package Collection.treeSetDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treesetTest {
    public static void main(String[] args) {
        //treeset的自定义比较方法
        Set<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        set.add(new Teacher("张三", 20, 1999.9));
        set.add(new Teacher("李四", 3, 2344.5));
        set.add(new Teacher("王五", 234, 1997.9));
        set.add(new Teacher("赵六", 5, 1996.9));

        System.out.println(set);
    }
}
