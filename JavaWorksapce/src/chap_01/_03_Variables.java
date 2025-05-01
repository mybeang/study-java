package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "야너두코딩";
        int hour = 15;

        System.out.println(name + "님, 배송 받을 준비 하소서. " + hour + "시 쯤에 올꺼임");
        System.out.println(name + "님, 배송 다했음. 빠잉");

        double score = 90.5;
        char grade = 'A';
        name = "끼야호";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println(name + "님의 학점은 '" + grade + "'입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? ; " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
