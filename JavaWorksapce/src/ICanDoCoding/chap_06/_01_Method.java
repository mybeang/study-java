package ICanDoCoding.chap_06;

public class _01_Method {
    public static void sayHello() {
        System.out.println("Hello world!!!");
    };

    public static int sum(int x, int y) {
        return x + y;
    };

    public static void main(String[] args) {
        sayHello();
        System.out.println(sum(1, 3));
        System.out.println(sum(10, 31));
        System.out.println(sum(11231, 3556));
    }
}
