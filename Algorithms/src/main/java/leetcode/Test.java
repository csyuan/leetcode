package leetcode;

/**
 * Created by slyuan on 17-4-20.
 */
public class Test {
    public static void main(String[] args) {

//        int n = 2;
//        int res = 1;
//        int count = 99;
//        while(n < count) {
//            res += getOnly(n);
//            ++n;
////            System.out.println(res);
//        }
////        System.out.println(n);
//        System.out.println(res);

        Father father = new Father();
        Father child = new Child();
        System.out.println(father.getName());
        System.out.println(child.getName());
    }

    private static int getOnly(int num) {
        int number = 0;
        String s = num + "";
        int len = s.length();
        if(len != 0){
            for(int i = 0; i < len; i++) {
                char a = s.charAt(i);
                if(a == '1') {
                    number ++;
                }
            }
        }
        return number;

    }
}


class Father {
    public static String getName() {
        return "Father ";
    }
}

class Child extends Father {
    public static String getName() {
        return "Child";
    }
}