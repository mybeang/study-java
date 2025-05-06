package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
        for (int i=0; i < coffees.length; i++) {
            if (coffees[i] == "카페모카") {
                coffees[i] = "바닐라라떼";
            }
            System.out.println(coffees[i] + "\t\t하나");
        }

        // foreach
        for (String coffee : coffees) {
            if (coffee == "카페모카") {
                System.out.println("바닐라라떼\t\t하나");
            }
            System.out.println(coffee + "\t\t하나");
        }
    }
}
