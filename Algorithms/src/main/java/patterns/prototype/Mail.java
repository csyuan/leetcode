package patterns.prototype;

import java.util.ArrayList;

/**
 * Created by slyuan on 17-5-15.
 */
public class Mail implements Cloneable{
    private String receiver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;

    /**
     * 深拷贝与浅拷贝
     *
     */
    private ArrayList<String> arrayList = new ArrayList<>();


    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvContext();
    }

    /**
     * 1.原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，
     * 特别是要在一个循环体内产生大量的对象，体现其有点
     *
     * 2.原型模式直接在内存中拷贝，构造函数是不会执行
     *
     * 3.很少单独出现，一般是和工厂方法模式一起使用
     */

    /**
     * 浅拷贝
     * 继承于Object类的clone()方法，返回对象可以是其子类
     * @return Mail（Object的之类）
     */
//    @Override
//    protected Mail clone() {
//        Mail mail = null;
//        try {
//            mail = (Mail)super.clone();
//        } catch (CloneNotSupportedException e) {
//            //TODO catch block
//            e.printStackTrace();
//        }
//        return mail;
//    }

    /**
     * 深拷贝
     * 继承于Object类的clone()方法，返回对象可以是其子类
     * @return Mail（Object的之类）
     */
    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
            mail.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            //TODO catch block
            e.printStackTrace();
        }
        return mail;
    }

    public ArrayList<String> getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(String value) {
        this.arrayList.add(value);
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
