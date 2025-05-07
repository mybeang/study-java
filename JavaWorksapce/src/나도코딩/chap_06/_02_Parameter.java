package 나도코딩.chap_06;

public class _02_Parameter {
    public static int power(int x) {
        int y = x * x;
        System.out.println(y);
        return y;
    }

    public static int powerByExp(int x, int y) {
        int res = 1;
        for (int i=0; i < y; i++) {
            res *= x;
        }
        System.out.println(res);
        return y;
    }

    public static void main(String[] args) {
        power(power(power(power(2))));
        System.out.println();
        powerByExp(2, 10);
        powerByExp(2, 30);
    }
}
