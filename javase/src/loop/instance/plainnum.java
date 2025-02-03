package loop.instance;

public class plainnum {
    public static void main(String[] args) {
        //寻找101-200之间的素数
        for(int i=101;i<=200;i++){
            if(isplain(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isplain(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
