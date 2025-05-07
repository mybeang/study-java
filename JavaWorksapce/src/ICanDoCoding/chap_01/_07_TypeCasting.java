package ICanDoCoding.chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 -> 실수형 / 실수형 -> 정수형

        // int to double (or float)
        int score = 93;
        System.out.println(score); // 93
        System.out.println((double) score); // 93.0

        // double (or float) to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score = 93 + (int) 98.8;
        System.out.println(score);
        score_d = 93 + 98.8;
        System.out.println(score_d);

        double convertedScoreDouble = score;  // 자동으로됨
        System.out.println(convertedScoreDouble);

        int convertedScoreInt = (int) score_d;  // 수동으로 해야됨
        System.out.println(convertedScoreInt);

        long longNo = 1_000_000_000_000_000L;
        System.out.println(longNo);  // 1000000000000000
        System.out.println((int) longNo);  // -1530494976

        int s1 = 93;
        System.out.println(s1);
//        String s2 = String.valueOf(s1);
        String s2 = Integer.toString(s1 + 3);
        System.out.println(s2);
        int s3 = Integer.parseInt(s2 + 1);
        System.out.println(s3);

        int error = Integer.parseInt("asdf");
    }
}
