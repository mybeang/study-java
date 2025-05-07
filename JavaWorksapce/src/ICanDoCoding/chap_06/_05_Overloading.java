package ICanDoCoding.chap_06;

// 같은 이름의 함수라도 parameter 의 타입이 다르거나 갯수가 다르면 다른 함수로 취급
// 동작도 알아서 맞춰 동작하게됨

public class _05_Overloading {
    public static int getPower(int x) {
        return x * x;
    }

    public static int getPower(String x) {
        int number = Integer.parseInt(x);
        return number * number;
    };

    public static int getPower(int x, int y) {
        int res = 1;
        for (int i=0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
    }
}

