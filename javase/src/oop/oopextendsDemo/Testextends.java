package oop.oopextendsDemo;

public class Testextends {
    public static void main(String[] args) {
        //如果子类想访问父类的变量，可以使用super关键字
        Zi zi = new Zi();
        zi.show();
        zi.method();
        System.out.println(zi);
    }
}

class Fu{
    //protected修饰的变量也可以在子孙类中直接访问，并且是使用super关键字访问
    protected String name = "父类的name";

    public String getName(){
        return name;
    }

    public void method(){
        System.out.println("父类的方法执行了");
    }
}

class Zi extends Fu{
    String name = "子类的name";

    @Override
    public void method() {
        System.out.println("子类的方法执行了");
    }

    //方法重写：重写的object类中的toString方法，本身输出对象输出的是对象的地址，更改之后输出对象输出的是对象的内容
    @Override
    public String toString(){
        return "Zi{" +
                "name='" + name + '\'' +
                ", name='" + super.name + '\'' +
                '}';
    }

    public void show(){
        String name = "局部变量";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(getName());
    }
}
