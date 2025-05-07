package 나도코딩.chap_06;

public class _03_Return {
    public static int sum(int start, int end, int step) {
        int result = 0;
        for (int i = start; i <= end; i += step) {
            result += i;
        }
        return result;
    };

    public static void main(String[] args) {
        System.out.println(sum(1, 10, 1));
        System.out.println(sum(1, 100, 1));
        System.out.println(sum(2, 100, 2));
    }
}
