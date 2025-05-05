package chap_04;

public class _06_While {
    public static void main(String[] args) {
        int move = 0;
        int distance = 25;
        while (move <= distance) {
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착!");

        move = 0;
        while (true) {
            if (move > distance) break;
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착!");
    }
}
