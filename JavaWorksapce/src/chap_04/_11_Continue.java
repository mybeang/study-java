package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == noShow) {
                System.out.println(i + "번 손님 없네?");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("준비한 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("빠앙");
    }
}
