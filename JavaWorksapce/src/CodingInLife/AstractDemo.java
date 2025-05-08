package CodingInLife;


abstract class Parent {
    static final String worldName = "Asgard";
    static String location = "galaxy";
    public abstract int functionA();
    public void print() {
        System.out.println("Hello " + this.worldName + " in " + this.location);
    }
}

class ChildA extends Parent {
    public int functionA() {
        return 0;
    }
    public void byePrint() {
        System.out.println("Bye " + this.worldName + " in " + this.location);
    }
}

//class ChildB extends Parent {   // abstract 로 선언한 member 의 override 는 필수로 해야한다.
//    public void print() {
//        System.out.println("Bye world");
//    }
//}


public class AstractDemo {
    public static void main(String[] args) {
        // Parent p = new Parent(); 사용 못함
        ChildA cA = new ChildA();
        System.out.println(cA.functionA());
        cA.print();
        cA.byePrint();
        // cA.worldName = "midgard"; 못바꿔
        cA.location = "milky way";
        cA.print();
        cA.byePrint();
    }
}
