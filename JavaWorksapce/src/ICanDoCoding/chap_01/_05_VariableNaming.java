package ICanDoCoding.chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 적는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능. 공백 사용 불가
        // 3. 밑줄 또는 문자로 시작 가능. (숫자로 시작 불가)
        // 4. 한 단어 또는 2개 이상의 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (캄멜)
        // 6. 예약어 사용 불가

        // 입국 신고서
        String nationality = "Korea"; // 국적
        String firstName = "Coding"; // 이름
        String lastName = "Metoo"; // 성
        String dateOfBirth = "1985-01-01"; // 생년월일
        String residentialAddress = "Saveme Hotel"; // 체류지
        String purposeOfVisit = "Trip"; // 입국 목적
        String flightNo = "KO09876";
        String _flightLastNo = "-1234";
        String flight_no_2 = flightNo + _flightLastNo;
        // String -flightNo = "KO09876"

        int accompany = 2; // 동반 가족수
        int lengthOfStay = 5; // 체류 기간 (Days)

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자제품";

        // 프로그램 흐름상 크게 중요하지 않은 임시 변수
        int i = 0;
        String s = "";

        // 절대 변하지 않는 상수
        final String CODE = "KR";
        // CODE = "US";  // 못 바꿔 !!
    }
}
