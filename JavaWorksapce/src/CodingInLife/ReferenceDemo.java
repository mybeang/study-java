package CodingInLife;

class TestA {
    public int id;
    TestA(int id) {
        this.id = id;
    }
    TestA(TestA obj) {
        this.id = obj.id;
    }
}


public class ReferenceDemo {


    public static void main(String[] args) {
        // 복제
        int a = 1;
        int b = a;
        System.out.print(String.format("a(%d) vs b(%d)\n", a, b));
        b++;
        System.out.print(String.format("a(%d) vs b(%d)\n", a, b));
        System.out.println();

        String i = "Hello world!";
        String j = i;
        System.out.print(String.format("i(%s) vs j(%s)\n", i, j));
        j += " Save me plz";
        System.out.print(String.format("i(%s) vs j(%s)\n", i, j));
        System.out.println();

        // class의 참조 와 복제
        TestA x = new TestA(10);
        TestA y = x;
        TestA z = new TestA(x);
        System.out.print(String.format("x(%d) vs y(%d) vs z(%d)\n", x.id, y.id, z.id));
        y.id += 10;
        z.id += 20;
        System.out.print(String.format("x(%d) vs y(%d) vs z(%d)\n", x.id, y.id, z.id));
        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("x.equals(z): " + x.equals(z));
    }
}
