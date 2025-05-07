package 나도코딩.chap_01;

/*
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
*/

public class _Quiz_01 {
    public static void main(String[] args) {
        // Quiz 1
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형 변수에 정의 합니다.
        // 정보:
        // 버스 번호는 "1234", "상암08" 과 같은 형태
        // 남은 시간은 분 단위 (예: 3분, 5분)
        // 남은 거리는 km 단위 (예: 1.5.km, 0.8km)

        String busNo = "상암08";
        int estimatedArrivalTime = 3;
        double remainingDistance = 1.2;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + estimatedArrivalTime + "분 후 도착");
        System.out.println("남은 거리 " + remainingDistance + "km");
    }
}
