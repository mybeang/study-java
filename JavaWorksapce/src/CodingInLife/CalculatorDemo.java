package CodingInLife;


class Calculator {
    int x, y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void chgData(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return this.x + this.y;
    }

    public int substraction() {
        return this.x - this.y;
    }

    public int multiple() {
        return this.x * this.y;
    }

    public int divide() {
        return this.x / this.y;
    }

    public void calcuAllMethod() {

        System.out.println("===============");
        System.out.println(String.format("x: %d, y: %d", this.x, this.y));
        System.out.println("---------------");
        System.out.println("sum: " + this.sum());
        System.out.println("substraction: " + this.substraction());
        System.out.println("multiple: " + this.multiple());
        System.out.println("divide: " + this.divide());
    }
}


class SecondClass extends Calculator {
    public SecondClass(int x, int y) {
        super(x, y);
    }

    public int rest() {
        return this.x % this.y;
    }

    public void calcuAllMethod() {
        super.calcuAllMethod();
        System.out.println("rest: " + this.rest());
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        Calculator calculator = new Calculator(10, 2);
        System.out.println(String.format("x: %d, y: %d", x, y));
        System.out.println("sum: " + calculator.sum());
        System.out.println("substraction: " + calculator.substraction());
        System.out.println("multiple: " + calculator.multiple());
        System.out.println("divide: " + calculator.divide());

        calculator.chgData(30, 6);
        calculator.calcuAllMethod();

        System.out.println("\naccess x (instance member) => " + calculator.x + "\n");

        SecondClass sclass = new SecondClass(20, 3);
        sclass.calcuAllMethod();

    }
}
