package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //制作一个斗地主程序，要求输出54张牌，并且要区分花色和牌面，并且要考虑大小王，并且要实现洗牌的功能
        createarray();
    }

    public static void createarray(){
        String[] poker = new String[54];
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //把各种花色和数组组合起来存到数组中
        int index = 0;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<numbers.length;j++){
                poker[index] = colors[i]+numbers[j];
                index++;
            }
        }

        poker[index++] = "🃏";
        poker[index] = "👲";

        //输出所有的54张牌
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+" ");
        }
        System.out.println();

        //洗牌
        for (int i = 0; i < poker.length; i++) {
            String temp = poker[i];
            int index1 = (int)(Math.random()*poker.length);
            poker[i] = poker[index1];
            poker[index1] = temp;
        }
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+" ");
        }
    }
}
