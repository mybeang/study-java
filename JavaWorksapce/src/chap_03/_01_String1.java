package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.length());  // 문자열 길이
        System.out.println(s.toLowerCase());  // 전부 소문자
        System.out.println(s.toUpperCase());  // 전부 대문자
        System.out.println(s.contains("Java"));  // 문자 확인 (true)
        System.out.println(s.contains("C#"));  // 문자 확인 (false)
        System.out.println(s.indexOf("Java"));  // 문자열 위치 정보 (7)
        System.out.println(s.indexOf("C#"));  // 문자열 위치 정보 (-1)
        System.out.println(s.lastIndexOf("and"));  // 마지막 문자 위치
        System.out.println(s.startsWith("I like"));  // 시작 문자열 확인
        System.out.println(s.endsWith("."));  // 맺음 문자열 확인
        System.out.println(s.charAt(7));  // 문자열 위치로 문자 찾기 (J)

    }
}
