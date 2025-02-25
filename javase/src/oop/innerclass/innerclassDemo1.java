package oop.innerclass;

public class innerclassDemo1 {
    public static void main(String[] args) {
        //关于匿名内部类的常见使用形式和作用
        //直接使用匿名内部类，实现接口，实现接口中的方法
        //匿名内部类实际上是定义了一个子类，同时也创建了一个子类对象。
        swim teacher = new swim() {
            @Override
            public void swim() {
                System.out.println("老师在游泳");
            }
        };
        swim student = new swim() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }
        };
        start(teacher);

        System.out.println("=======================");
        start(student);
    }

    //定义一个方法，来开始老师和学生的游泳动作，传入的是一个接口类型，因为不确定是老师还是学生，所以使用接口
    public static void start(swim s){
        System.out.println("开始游泳了=========");
        s.swim();
        System.out.println("游泳结束===========");
    }
}

//定义一个接口，来规范老师和学生的游泳行为
interface swim{
    void swim();
}
