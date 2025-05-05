package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                System.out.print(String.format("%d x %d = %d\t", j, i, i*j));
//                System.out.print(j + " x " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
