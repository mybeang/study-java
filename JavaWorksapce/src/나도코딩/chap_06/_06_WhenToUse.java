package 나도코딩.chap_06;

public class _06_WhenToUse {
    public static int getPower(int x) {
        return getPower(x, x);
    }

    public static int getPower(int x, int y) {
        int res = 1;
        for (int i=0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        // 뭐.. 재사용성을 위한 것이지..
        System.out.println(getPower(3));
        System.out.println(getPower(3, 3));
    }
}
