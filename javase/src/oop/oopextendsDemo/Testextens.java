package oop.oopextendsDemo;

public class Testextens {
    public static void main(String[] args) {
        //如果子类想访问父类的变量，可以使用super关键字
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu{
    //protected修饰的变量也可以在子孙类中直接访问，并且是使用super关键字访问
    protected String name = "父类的name";

    public String getName(){
        return name;
    }
}

class Zi extends Fu{
    String name = "子类的name";

    public void show(){
        String name = "局部变量";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(getName());
    }
}
