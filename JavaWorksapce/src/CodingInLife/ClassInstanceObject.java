package CodingInLife;


public class ClassInstanceObject {  // public 함수는 파일당 1개뿐
    public static void main(String[] args) {
        BasicClass basicObj = new BasicClass("Holly Light");
        basicObj.sayHello();
        basicObj.printClassAttribute();
    }
}

class BasicClass {
    private String classAttribute01;

    public BasicClass(String arg01) {
        this.classAttribute01 = arg01;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    public void printClassAttribute() {
        System.out.println(this.classAttribute01);
    }
}