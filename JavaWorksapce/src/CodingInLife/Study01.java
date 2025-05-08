package CodingInLife;

abstract class Study01Calcurator {
    int left, right;
    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run() {
        sum();
        avg();
    }
}

class Study01CalculatorDecoPlus extends Study01Calcurator {
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

class Study01CalculatorDecoMinus extends Study01Calcurator {
    public void sum() {
        System.out.println(this.right - this.left);
    }
    public void avg() {
        System.out.println((this.right - this.left)/2);
    }
}

public class Study01 {
    public static void execute(Study01Calcurator cal) {
        System.out.println("result >>");
        cal.run();
    }
    public static void main(String[] args) {
        Study01CalculatorDecoPlus c1 = new Study01CalculatorDecoPlus();
        c1.setOperands(10, 20);
        c1.run();

        Study01CalculatorDecoMinus c2 = new Study01CalculatorDecoMinus();
        c2.setOperands(10, 20);
        c2.run();

        System.out.println("---------------------------");

        Study01Calcurator c3 = new Study01CalculatorDecoPlus();
        c3.setOperands(10, 20);

        Study01Calcurator c4 = new Study01CalculatorDecoMinus();
        c4.setOperands(10, 20);

        execute(c3);
        execute(c4);
    }
}
