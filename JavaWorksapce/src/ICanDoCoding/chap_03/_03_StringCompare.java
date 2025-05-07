package ICanDoCoding.chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));  // 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));  // 같으면 true, 다르면 false
        System.out.println(s1 == s2);
        System.out.println(s1 == "Java");

        System.out.println(s2.equals("python"));
        System.out.println(s2.toLowerCase().equals("python"));
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234";  // Origin data
        s2 = "1234";  // 다른 메모리 영역에 저장된 같은 값을 그대로 활용 (참조)
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));

        s1 = new String("1234");  // Origin data
        s2 = new String("1234");  // 새로운 메모리 영역에 저장
        System.out.println(s1.equals(s2));  // 컨텐츠(문자열)를 비교
        System.out.println(s1 == s2);  // 메모리 참조를 비교
    }
}
