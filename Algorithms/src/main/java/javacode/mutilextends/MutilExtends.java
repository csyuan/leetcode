package javacode.mutilextends;

/**
 * Created by hadoop on 17-5-25.
 */
public class MutilExtends extends Father implements InterfaceA{
    public static void main(String[] args) {
        MutilExtends me = new MutilExtends();
        me.println();
    }


    @Override
    public void println(){
        System.out.println("this is child");
    }
}
