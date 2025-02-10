package oop.EnumDemo;

public class Test {
    public static void main(String[] args) {
        //介绍枚举类的作用和应用场景
        move(Direction.NORTH);
    }

    public static void move(Direction direction){
        switch(direction){
            case NORTH:
                System.out.println("向北移动");
                break;
            case SOUTH:
                System.out.println("向南移动");
                break;
            case EAST:
                System.out.println("向东移动");
                break;
            case WEST:
                System.out.println("向西移动");
                break;
        }

    }

    //枚举类：定义四个方向
    public enum Direction{
        NORTH,SOUTH,EAST,WEST;
    }
}
