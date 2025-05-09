package CodingInLife;

class ObjClsCalculator {
    int x, y;

    public ObjClsCalculator(int x, int y) {
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
    protected void finalize() {  // 9 이후로는 안씀. 그다지 중요치는 않은 듯. python 의 __del__ 과 비슷.
        System.out.println("Terminate Calculator");
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        ObjClsCalculator o = new ObjClsCalculator(3, 4);
        System.out.println(o.toString());
        o = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
