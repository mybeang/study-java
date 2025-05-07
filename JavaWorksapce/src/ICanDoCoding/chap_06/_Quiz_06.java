package ICanDoCoding.chap_06;

public class _Quiz_06 {
    public static String toPrivate(String str) {
        String result = "";
        if (str.contains("-") && str.split("-").length > 2) {
            result = str.split("-")[0] + "-" + str.split("-")[1] + "-" + "****";
        } else if (str.contains("-")) {
            result = str.split("-")[0] + "-" + str.split("-")[0].charAt(0) + "******";
        } else {
            for (int i=0; i < str.length(); i++) {
                if (i == 0) {
                    result += str.charAt(0);
                } else {
                    result += "*";
                }
            }
        }
        return result;
    }

    public static String getHiddenData(String data, int startIndex) {
        String result = data.substring(0, startIndex);
        for (int i=0; i < data.length() - startIndex; i++) {
            result += "*";
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("강사 코드 결과");
        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));

        System.out.println("\n내 코드 결과");
        System.out.println("이름: " + toPrivate(name));
        System.out.println("주민등록번호: " + toPrivate(id));
        System.out.println("전화번호: " + toPrivate(phone));

    }
}
