package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자 + - * /
        // 일반 연산
        System.out.println(4 + 1);  // 5
        System.out.println(10 - 2);  // 8
        System.out.println(2 * 8);  // 16
        System.out.println(6 / 2);  // 3
        System.out.println(5 % 3);  // 2
        System.out.println(5 / 3);  // 1
        System.out.println((double) (5 / 3));  // 1.0
        System.out.println((float) (5 / 3));  // 1.0
        System.out.println((double) 5 / (double) 3);  // 1.666666666667

        System.out.println(2 + 3 * 4);  // 14
        System.out.println((2 + 3) * 4);  // 20

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);  // 30
        System.out.println(b - a);  // 10

        // 증감 연산
        int val = 1;
        val += 1;
        System.out.println(val); // 2
        System.out.println(val++);  // 2
        System.out.println(val); // 3
        System.out.println(++val);  // 4
        System.out.println(--val); // 3
        System.out.println(val--); // 3
        System.out.println(val); // 3

        // 은행 대기번호
        int waiting = 0;
        String comments = "대기 인원 : ";
        System.out.println(comments + waiting++);
        System.out.println(comments + waiting++);
        System.out.println(comments + waiting++);
        System.out.println("총 " + comments + waiting);
    }
}
