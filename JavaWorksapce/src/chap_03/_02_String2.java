package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.replace("and", ","));
        System.out.println(s.replaceFirst("and", ","));
        System.out.println(s.replaceAll("and", ","));

        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        System.out.println(s.substring(s.indexOf("Java"), (s.length() - 1)));
        System.out.println(s.split(" and ")[0]);  // 문자 자르기  (I like Java)

        String s0 = s;
        String s1 = "      " + s + "        ";
        System.out.println(s1);
        System.out.println(s1.trim());

        String s2 = " Also I like a meat.";
        System.out.println(s0 + s2);
        System.out.println(s.concat(s2));
    }
}
