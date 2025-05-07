package 나도코딩.chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        int i;
        int j;

        // * 사각형
        for (i=0; i < 5; i++) {
            for (j=0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------------");
        // * 왼쪽 삼각형
        for (i=0; i < 5; i++) {
            for (j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------------");
        // * 오른쪽 삼각형
        for (i=4; i >= 0; i--) {
            for (j=0; j < 5; j++) {
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("---------------");
        for (i=0; i < 5; i++) {
            for (j=0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
