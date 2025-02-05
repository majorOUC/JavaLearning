package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //制作一个数字华容道的初始化和随即乱序
        start(5);
    }

    public static void start(int n){
        //初始化一个数字华容道的界面
        int[][] num = new int[n][n];
        int count = 1;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j] = count++;
            }
        }

        //打印数字华容道的界面
        printarray(num);

        System.out.println("============================");
        //打乱数字华容道的顺序
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                int temp = num[i][j];
                int index1 = (int)(Math.random()* num.length);
                int index2 = (int)(Math.random()* num[index1].length);
                num[i][j] = num[index1][index2];
                num[index1][index2] = temp;
            }
        }
        printarray(num);
    }

    public static void printarray(int[][] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
