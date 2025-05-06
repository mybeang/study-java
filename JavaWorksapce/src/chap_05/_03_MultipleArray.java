package chap_05;

public class _03_MultipleArray {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
                {"D1", "D2", "D3", "D4", "D5"},
        };
        System.out.println(seats[1][1]);
        System.out.println("-----------------");
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
