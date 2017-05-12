package leetcode;

/**
 * Created by hadoop on 17-5-12.
 */
public class BasicThis {
    public static void main(String[] args) {
        go(new MyBase());
    }
    static void go(Base b) {
        b.add(8);
//        b.print();
    }
    // 1.程序执行流程：首先执行new MyBase(),在这个过程中，子类会首先调用父类的构造函数；
    // 2.在父类的构造函数Base()中执行add()方法。
    // 3.这里需要注意，这个add方法由于在新建MyBase对象时调用，将会首先查找MyBase类中是否有此方法
    // 4.所以Base()函数中的add(1)实际上是执行的子类中的add方法。
}


class Base {
    int i;
    Base() {
        add(1);
        System.out.println(i);
    }

    void add(int v) {
        i += v;
        System.out.println(i);
    }

    void print() {
        System.out.println(i);
    }
}

class MyBase extends Base {
    MyBase() {
        add(2);
    }

    @Override
    void add(int v) {
        i += v * 2;
        System.out.println(i);
    }
}