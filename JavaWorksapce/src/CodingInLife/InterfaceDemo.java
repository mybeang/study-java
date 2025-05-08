package CodingInLife;

// 많은 개발자들이 서로 연결되어야 하는 지점.
// 뭐.. 당연한 것이긴 한데 이것을 문서로 하는게 아니라 코드에서 강제화 할 수 있다는 점이 있는거네..
interface I {
    public void z();
}


class IA implements I{
    public void z() {
        System.out.println("this is 'z'");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        IA a = new IA();
        a.z();
    }
}
