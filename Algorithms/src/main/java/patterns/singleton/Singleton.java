package patterns.singleton;

import java.util.ArrayList;

/**
 * Created by hadoop on 17-5-15.
 */
public class Singleton {

    private static Singleton singleton = null;
    //懒汉式单例模式，非线程安全，所以需要加同步方法

    private Singleton() {

    }

    //固定数量的实例
    private static int maxNumOfObject = 2;
    private static ArrayList<Singleton> singletons = new ArrayList<>();
    private static int countNumOfObject = 0;

    static {
        for(int i = 0; i < maxNumOfObject; i++) {
            singletons.add(new Singleton());
        }
    }


    //方法1：
    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //方法2：
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    //方法3：静态内部类

/*    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }*/

}
