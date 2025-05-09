package CodingInLife;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>(Arrays.asList("one", "two", "two", "three"));
        for (Object a: a1) {
            System.out.println(a);
        }
        a1.add("four");
        String k = (String) a1.get(a1.size()-1);  // param은 index 값. 내부 Data Type 이 Object 이기 때문에 형변환 필요.
        System.out.println(k);

        System.out.println("\nUsing generic");
        // Generic 을 추가로 사용하여 item 의 Data Type 을 지정할 수 있다.
        ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("one", "two", "two", "three"));
        for (Object a: a2) {
            System.out.println(a);
        }
        a2.add("four");
        String k2 = a2.get(a1.size()-1);
        System.out.println(k2);

        System.out.println("\nUsing generic and set");
        // Generic 을 추가로 사용하여 item 의 Data Type 을 지정할 수 있다.
        HashSet<String> a3 = new HashSet<String>(Arrays.asList("one", "two", "two", "three"));
        for (Object a: a3) {
            System.out.println(a);
        }
        System.out.println("\nIterator");
        Iterator hi = a3.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
