package ICanDoCoding.chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int sizes[] = new int[10];
        int initSize = 250;
        String outputTextFormat = "사이즈 %d (재고 있음)";
        for (int i=0; i < sizes.length; i++) {
            sizes[i] = initSize;
            initSize += 5;
        }
        for (int size : sizes) {
            System.out.println(String.format(outputTextFormat, size));
        }
    }
}
