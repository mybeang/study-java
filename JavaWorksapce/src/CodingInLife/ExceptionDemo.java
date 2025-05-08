package CodingInLife;

public class ExceptionDemo {
    public static void main(String[] args) {
        double i = 1;
        try {
            i = 1/0;
        } catch (Exception e) {
            System.out.println("Catch !\n" + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        int k[] = {1,2,3};
        try {
            System.out.println(k[2]);
            i = 10.0/20.0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index error");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("마침내!!!!");
        }
        System.out.println(i);

    }
}
