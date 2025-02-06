package oop.oopDemo2;

import oop.oopDemo1.Stu;

public class TestDemo {
    public static void main(String[] args) {
        //类的封装，合理隐藏，合理暴露
        Student zang = new Student();
        zang.setName("臧莹莹");
        zang.setAge(23);
        zang.setSex('女');
        zang.setChinese(100);
        zang.setMath(100);

        System.out.println(zang.getName()+" "+zang.getAge()+" "+zang.getSex()+" "+zang.getChinese()+" "+zang.getMath());
        System.out.println("============下面是使用封装好的方法来打印信息==============");
        zang.printStudentInfo();
    }
}
