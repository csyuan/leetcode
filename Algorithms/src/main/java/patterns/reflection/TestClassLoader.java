package patterns.reflection;

/**
 * Created by Sl YUAN on 2016/5/12.
 */

public class TestClassLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
//        System.out.println(com.sun.crypto.provider.AESCipher.class.getClassLoader().getClass().getName());
        System.out.println(TestClassLoader.class.getClassLoader().getClass().getName());
        System.out.println(TestClassLoader.class.getClassLoader());
        System.out.println(TestClassLoader.class.getName());
    }
}
