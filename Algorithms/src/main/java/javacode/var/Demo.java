package javacode.var;

/**
 * Created by hadoop on 17-5-27.
 */
public class Demo {
    public static void main(String[] args) {
        Info<String> info;
//        info = new InfoImpl<>("Jack");// 通过子类实例化对象
//        System.out.println("content : " + info.getVar());

        //demo1
        info = new InfoImpl2("Jack");
        System.out.println("content : " + info.getVar());

        Integer arr[] = fun1(1,2,3,4,5,6) ;   // 返回泛型数组
        fun2(arr) ;

    }

    public static <T extends Number> InfoImpl<T> fun(T param){
        InfoImpl<T> temp = new InfoImpl<T>() ;      // 根据传入的数据类型实例化Info
        temp.setVar(param) ;        // 将传递的内容设置到Info对象的var属性之中
        return temp ;   // 返回实例化对象
    }


    public static <T> T[] fun1(T...arg){  // 接收可变参数
//        System.out.println(arg);
        return arg ;            // 返回泛型数组

    }
    public static <T> void fun2(T param[]){   // 输出
        System.out.print("接收泛型数组：") ;
        for(T t : param){
            System.out.print(t + "、") ;
        }
    }
}
