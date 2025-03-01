package set.baozhuanglei;

import java.util.ArrayList;

public class genericitydemo {
    public static void main(String[] args) {
        //简单举几个泛型和包装类的例子
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("world");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(getFirst(str));
        System.out.println(getFirst(num));

        //java中的包装类提供了引用数据类型和基本数据类型互相转换的方法，同时可以使用自动装箱和自动拆箱
        Integer i1 = 23;
        int i2 = i1;
        String num1 = "123";
        System.out.println(num1+ "+5的结果是："+(Integer.valueOf(num1)+5));
        Integer num2 = 55;
        String num22 = Integer.toString(num2);
        System.out.println(num2);

    }

    //设计一个方法，返回动态数组中的第一个值
    public static <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }
}
