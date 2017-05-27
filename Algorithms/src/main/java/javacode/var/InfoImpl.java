package javacode.var;

/**
 * Created by hadoop on 17-5-27.
 */
public class InfoImpl<T> implements Info<T> {// 定义泛型接口的子类

    private T var; // 定义属性

    public InfoImpl() { // 通过构造方法设置属性内容
    }

    public InfoImpl(T var) { // 通过构造方法设置属性内容
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return this.var;
    }

}
