package leetcode;

/**
 * Created by slyuan on 17-4-20.
 */
public class Test {
    public static void main(String[] args) {

        int n = 2;
        int res = 1;
        int count = 99;
        while(n < count) {
            res += getOnly(n);
            ++n;
//            System.out.println(res);
        }
//        System.out.println(n);
        System.out.println(res);
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
