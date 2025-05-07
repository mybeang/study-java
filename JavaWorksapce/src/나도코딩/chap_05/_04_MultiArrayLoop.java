package 나도코딩.chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2", "D3", "D4", "D5"},
        };
        System.out.println(seats2[1][1]);
        System.out.println("-----------------");
        for (String[] row : seats2) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        int rowNum = 10;
        int colNum = 15;
        String[][] seats = new String[rowNum][colNum];
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i=0; i < rowNum; i++) {
            for (int j=1; j <= colNum; j++) {
                seats[i][j-1] = alphabet[i] + String.format("%02d", j);
            }
        }
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        seats[8][9] = "___";
        seats[8][10] = "___";
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
