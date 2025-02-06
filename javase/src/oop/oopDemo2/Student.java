package oop.oopDemo2;

public class Student {
    private String name;
    private int age;
    private char sex;
    private int Chinese;
    private int Math;

    public Student(){
    }

    public Student(String name, int age, char sex, int Chinese, int Math){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.Chinese = Chinese;
        this.Math = Math;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){
        return this.sex;
    }

    public void setChinese(int Chinese){
        this.Chinese = Chinese;
    }

    public int getChinese(){
        return this.Chinese;
    }

    public void setMath(int Math){
        this.Math = Math;
    }

    public int getMath(){
        return this.Math;
    }

    public void printStudentInfo(){
        System.out.println(this.name+"的年龄是"+this.age+"，性别是"+this.sex+"，成绩是"+this.Chinese+"，"+this.Math);
    }
}
