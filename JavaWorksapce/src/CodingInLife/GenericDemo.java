package CodingInLife;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T>{
    public T info;
    Person(T info){
        this.info = info;
    }
}


public class GenericDemo {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>("Mike");
        Person<StringBuilder> p2 = new Person<StringBuilder>(new StringBuilder("Chally"));
//        Person<int> p3 = new Person<int>(3); // Type 변수는 기본 변수는 안됨. char, double 등..

        System.out.println(p1.info);
        System.out.println(p2.info);

        Person<EmployeeInfo> pr1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = pr1.info;
        System.out.println(ei1.rank); // 성공

        Person<String> pr2 = new Person<String>("부장");
        String ei2 = pr2.info;
//        System.out.println(ei2.rank); // 컴파일 실패
    }
}
