package array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //创建一个二维数组存储班级学生的位置信息，并且随机打乱顺序
        start();
    }

    public static void start(){
        String[][] stu = {
            {"张三","男","1班","1"},
            {"李四","女"},
            {"王五","男","3班"},
            {"赵六","女","4班","4"},
        };

        printarray(stu);
        System.out.println("=====================");

        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[i].length; j++) {
                String temp = stu[i][j];
                int index1 = (int)(Math.random()* stu.length);
                int index2 = (int)(Math.random()* stu[index1].length);
                stu[i][j] = stu[index1][index2];
                stu[index1][index2] = temp;
            }
        }
        printarray(stu);
    }

    public static void printarray(String[][] stu){
        for(int i=0;i<stu.length;i++){
            for(int j=0;j<stu[i].length;j++){
                System.out.print(stu[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
