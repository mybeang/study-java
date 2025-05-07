package 나도코딩.chap_04;

public class _05_For {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("times: " + i);
        }
        System.out.println("\n");
        for (i = 0; i < 20; i += 2) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        int j;
        for (i=0; i < 5; i++) {
            for (j=0; j < 5; j++) {
                System.out.println("i:j = " + i + ":" + j);
            }
        }
        System.out.println("\n");
        for (i=0; i < 5; i++) {
            for (j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (i=0; i < 5; i++) {
            for (j=5; i < j; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int sum = 0;
        for (i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
