package ICanDoCoding.chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String identify01 = "901231-1234567";
        String identify02 = "030708-2345678";

        System.out.println(identify01.substring(0, (identify01.indexOf("-") + 2)));
        System.out.println(identify02.substring(0, (identify02.indexOf("-") + 2)));

    }
}
