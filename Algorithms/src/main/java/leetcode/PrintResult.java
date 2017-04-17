package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by slyuan on 17-4-7.
 */
public class PrintResult {
    public static void main(String[] args) {
        Result result = new Result();
        System.out.println("input a num :");
        int a = InputData.getInt();
        result.print(a);
    }

}

class InputData {
    static private String s = "";
    static public void input() {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = bu.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public int getInt() {
        input();
        return Integer.parseInt(s);
    }
}

class Result {
    void print(int d) {
        System.out.println(d + "pingf" + d * d );
        System.out.println(d + "lif" + d * d * d);
    }
}