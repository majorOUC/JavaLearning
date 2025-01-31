package loop.forloop;

public class instance {
    public static void main(String[] args) {
        //for循环的演示案例
        //求前五个数的和
        sum();
        System.out.println("------------------");

        System.out.println("------------------");

        //求1-10之间的奇数和
        System.out.println(getoddsum(10));
        System.out.println("------------------");

        //求所有的水仙花数
        sxh();

    }

    public static void sum(){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum+=i+1;
        }
        System.out.println(sum);
    }

    public static int getoddsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }

    public static void sxh(){
        //水仙花数首先是三位数，其次百位、十位、个位的数字立方和是这个三位数的本身，
        int sum = 0;
        for(int i=100;i<1000;i++){
            int a = i/100;//百位数
            int b = i%100/10;//十位数
            int c = i%100%10;//个位数
            if(a*a*a+b*b*b+c*c*c==i)
                System.out.println(i);
        }
    }




}
