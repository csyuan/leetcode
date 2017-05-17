package patterns.singleton;

/**
 * Created by hadoop on 17-5-15.
 */
public class Emperor {

    //饿汉式单例模式，线程安全
    private static final Emperor emperor = new Emperor();

    private Emperor() {
        //不让产生第二个
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("I am the emperor ...");
    }
}
