package ICanDoCoding.chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 일부러 앞 내용 써가면서 한건디..ㅋ

        int carCode = 2;  // 1; 경차, 2; 장애인차량
        String carCodeName;
        int stayHour = 10;
        int costPerHour = 4000;
        int maxCost = 30000;
        int totalCost = 0;
        boolean advantage = true;

        switch (carCode) {
            case 1:
                advantage = true;
                carCodeName = "경차";
                break;
            case 2:
                advantage = true;
                carCodeName = "장애인차량";
                break;
            default:
                carCodeName = "일반차량";
        }

        for (int i = 0; i < stayHour; i++) {
            if (totalCost > maxCost) {
                totalCost = maxCost;
                break;
            }
            totalCost += costPerHour;
        }
        if (advantage) totalCost *= 0.5;

        System.out.println(String.format("총 채류 시간: %d h. 차량 타입: %s. 총 금액: %d원", stayHour, carCodeName, totalCost));
    }
}
