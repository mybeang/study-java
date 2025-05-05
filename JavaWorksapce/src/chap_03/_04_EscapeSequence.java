package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특문
        System.out.println("Hello world!");
        System.out.println("Hello\nworld!");
        System.out.println("Hello\tworld!");
        System.out.println("Hello \"world!\"");
        System.out.println("Hello \'world!\'");
        System.out.println("Hello 'world!'");
        System.out.println("Hello \\world!\\");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
