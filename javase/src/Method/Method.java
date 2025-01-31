package Method;

public class Method {
    public static void main(String[] args) {
        print("nishiyigedabendan");
        print("------------------");

        print("wangmengzheaizangyingying", 20);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
