package 나도코딩.chap_04;

public class _10_Break {
    public static void main(String[] args) {
        int max = 20;
        for (int guest = 1; guest <= 50; guest++) {
            if (guest > max) {
                System.out.println("준비한 재료가 모두 소진되었습니다.");
                break;
            }
            System.out.println(guest + "번 손님, 주문하신 치킨 나왔슴다");
        }
        System.out.println("빠앙");
    }
}
