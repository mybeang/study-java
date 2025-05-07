package ICanDoCoding.chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int move = 0;
        int distance = 25;
        int height = 25;

        System.out.println("-- while --");
        while (move + height < distance) {
            System.out.println("현재 이동 거리: " + (move + height));
            move += 3;
        }
        System.out.println("도착!");
        System.out.println("-- do while --");
        move = 0;
        do {
            System.out.println("현재 이동 거리: " + (move + height));
            move += 3;
        } while (move + height < distance);
        System.out.println("도착!");
    }
}
