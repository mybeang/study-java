package ICanDoCoding.chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        for (int i=0; i < 10; i++) {
            c++;
            System.out.println(c);
        }

        System.out.println("=====================");
        int rowNum = 10;
        int colNum = 15;
        String[][] seats = new String[rowNum][colNum];
        char a = 'A';
        for (int i=0; i < rowNum; i++) {
            for (int j=1; j <= colNum; j++) {
                seats[i][j-1] = String.valueOf(a) + String.format("%02d", j);
            }
            a++;
        }
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
