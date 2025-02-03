package loop.instance;

import java.util.Scanner;

public class yanzhengma {
    public static void main(String[] args) {
        //用户输入验证码的位数，然后输出验证码
        Scanner sc = new Scanner(System.in);
        int t = 0;
        do {
            System.out.println("请输入验证码位数:");
            t = sc.nextInt();
            System.out.println("验证码是" + getcode(t));
        }while(t!=0);

    }

    public static String getcode(int t){
        String code = "";
        for(int i=0;i<t;i++){
            int type = (int)(Math.random() *3);
            switch(type){
                case 0:
                    //生成大写字母
                    char ch = (char)('A'+(int)(Math.random()*26));
                    code += ch;
                    break;
                case 1:
                    //生成小写字母
                    char ch1 = (char)('a'+(int)(Math.random()*26));
                    code += ch1;
                    break;
                case 2:
                    //生成数字
                    int num = (int)(Math.random()*10);
                    code += num;
                    break;
            }
        }
        return code;
    }
}
