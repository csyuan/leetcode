package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slyuan on 17-4-24.
 */
public class Inner {

    private String value = null;

    public Inner(String v) {
         value = v;
    }

    //Object的equals中传入参数为Object o
    public boolean equals(Inner o) {
        if (o == this) {
            return true;
        }

        if ( o instanceof Inner) {
            Inner inner = (Inner) o;
            return value.equals(inner.value);
        }
        return false;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        Inner inner1 = new Inner("object");
        Inner inner2 = new Inner("object");
        Inner inner3 = new Inner("object");
        Inner inner21 = inner2;
        Object inner4 = new Inner("object");
        list.add(inner1);

        System.out.println(list.contains(inner2));
        System.out.println(inner2.equals(inner3));
        System.out.println(inner2.equals(inner21));
        System.out.println(inner3.equals(inner4));

    }
}
