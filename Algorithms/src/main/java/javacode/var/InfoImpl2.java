package javacode.var;

/**
 * Created by hadoop on 17-5-27.
 */
public class InfoImpl2 implements Info<String> {
    //如果现在实现接口的子类不想使用泛型声明，则在实现接口的时候直接指定好其具体的操作类型
    private String var ;// 定义属性

    public InfoImpl2(String var){        // 通过构造方法设置属性内容
        this.setVar(var) ;
    }

    public void setVar(String var){
        this.var = var ;
    }

    public String getVar(){
        return this.var ;
    }
}
