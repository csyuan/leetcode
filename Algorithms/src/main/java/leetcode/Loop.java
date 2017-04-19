package leetcode;

import java.util.*;

/**
 * Created by slyuan on 17-4-19.
 */

public class Loop {
    public static void listAll(List candidate, String prefix) {
        if(candidate.isEmpty()){
            System.out.println(prefix);
        }

        for(int i = 0; i < candidate.size(); i++) {
            List tmp = new LinkedList(candidate);
            listAll(tmp, prefix + tmp.remove(i)); //函数中的参数从右边开始解析
        }
    }

    public static long fibonacci(long m) {
        if(m == 0 || m == 1) {
            return m;
        } else {
            return fibonacci(m - 1) + fibonacci(m - 2);
        }
    }

    //一个字符串中，求出现次数最多的那个字母及次数，如果有多个重复的则都求出。
    public static void doString(String input) {
        char[] charArr = input.toCharArray();
        List list = new ArrayList();
        TreeSet set = new TreeSet();
        for(int i = 0; i < charArr.length; i++) {
            list.add(charArr[i]);
            set.add(charArr[i]);
        }
        System.out.println(set);
        Collections.sort(list);
        System.out.println(list);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        input = sb.toString();
        System.out.println(input);

        int maxNum = 0;
        String maxString = "";
        List maxList = new ArrayList();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next().toString();
            int startIndex = input.indexOf(str);
            int lastIndex = input.lastIndexOf(str);
            int tempMax = lastIndex - startIndex + 1;
            if(tempMax > maxNum) {
                maxNum = tempMax;
                maxString = str;
                maxList.add(str);
            } else if(tempMax == maxNum) {
                maxList.add(str);
            }
        }

        int index = 0;
        for(int i = 0; i < maxList.size(); i++) {
            if(maxList.get(i).equals(maxString)) {
                index = i;
                break;
            }
        }

        System.out.println("max data: ");

        for(int i = index; i < maxList.size(); i++) {
            System.out.print(maxList.get(i) + " ");
        }

        System.out.println();
        System.out.println("max: " + maxNum);
    }





    public static void main(String[] args) {
//        String[] array = new String[]{"1","2","3","4"};
//        listAll(Arrays.asList(array), "");
//        System.out.println(fibonacci(4));
//        doString("aavzcadfdsfsdhshgwasdfasdfdddaaa");

        String s = "1223";
        System.out.println(s.substring(1));
        System.out.println(s.substring(0,1));
        System.out.println("----");
        Pailie(s,"");
    }

    static int count = 0;

    static void Pailie(String s, String p) {
        if(s.length() < 1) {
            count ++;
            if(!"".equals(p))System.out.println(p);
        } else {
//            int[] index = new int[s.length()];
//            for(int i = 0; i < s.length(); i++) {
//                index[i] = s.indexOf(s.charAt(i));
//            }

            for(int i = 0; i < s.length(); i++) {
//                if(i == index[i]) {
//                    Pailie(s.substring(1), p+s.substring(0,1));
//                }
                s = s.substring(1) + s.substring(0,1);
                System.out.println(s);
            }
        }

    }



}
