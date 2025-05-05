package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        // 4등: 반반액 장학금
        // 그외: 장학금 대상 아님
        int ranking = 3;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금 대상자");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금 대상자");
                break;
            case 4:
                System.out.println("반반액 장학금 대상자");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
