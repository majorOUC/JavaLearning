package oop.interfaceDemo;

public class plan2 implements inf {
    //实现第二套方案
    @Override
    public void count(Student[] s) {
        int male = 0;
        int female = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].getSex()=='男'){
                male++;
            }else if(s[i].getSex()=='女'){
                female++;
            }
        }
        System.out.println("男:"+male+"女:"+female+"总人数为"+s.length);
    }

    @Override
    public void average(Student[] s) {
        int top = s[0].getScore();
        int bottom = s[0].getScore();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            int temp = s[i].getScore();
            if(temp>top)
                top = temp;
            if(temp<bottom)
                bottom = temp;
            count += temp;
        }
        System.out.println("最高分:"+top+"最低分:"+bottom+"去掉最高分和最低分后的平均分:"+(count-top-bottom)/(s.length-2));
    }
}
