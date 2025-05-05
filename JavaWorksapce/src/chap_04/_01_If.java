package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;
        if (hour > 13) {
            System.out.println("전반전) 커피 안마셔");
        } else {
            System.out.println("전반전) 커피 마실래");
        }
        System.out.println("전반전) 예얍");

        boolean morningCoffee = true;
        if (hour > 13 && morningCoffee) {
            System.out.println("후반전) 커피 안마셔");
        } else if (hour > 13 || morningCoffee) {
            System.out.println("후반전) 디카페인 커피로 마실래");
        } else {
            System.out.println("후반전) 커피 마실래");
        }
        System.out.println("후반전) 예얍");
    }
}
