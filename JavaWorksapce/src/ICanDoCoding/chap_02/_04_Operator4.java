package ICanDoCoding.chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean kimchi = true;
        boolean egg = true;
        boolean meat = true;

        System.out.println(kimchi || egg || meat);
        System.out.println(kimchi && egg && meat);
        egg = false;
        System.out.println(kimchi || egg || meat);
        System.out.println(kimchi && egg && meat);

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));

        System.out.println(!true);
        System.out.println(!false);
    }
}
