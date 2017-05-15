package patterns.reflection;

/**
 * Created by Sl YUAN on 2016/5/12.
 */
public class TestDynamicLoading {

    public static void main(String[] args) {

        new A();
        System.out.println("-----------");
        new B();

        new C();
        new C();

        new D();
        new D();
    }



}


class A {

}

class B {

}


class C {
    static {
        System.out.println("CCCCCC");
    }

}

class D {
    {
        System.out.println("DDDDDD");
    }
}