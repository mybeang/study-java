package 나도코딩.chap_05;

public class _01_Array {
    public static void main(String[] args) {
//        String[] coffees = new String[4];  선언 방법 1
//        String coffees[] = new String[4];  선언 방법 2
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "카페라떼";
//        coffees[3] = "카푸치노";

//        String[] coffees = new String[] {"아메리카노", "카페모카", "카페라떼", "카푸치노"};  선언 방법 3

        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};   // 선언 방법 4

        for (int i=0; i < coffees.length; i++) {
            if (coffees[i] == "카페모카") {
                coffees[i] = "바닐라라떼";
            }
            System.out.println(coffees[i] + "\t\t하나");
        }
    }
}
