package patterns.singleton;

/**
 * Created by hadoop on 17-5-15.
 */
public class Minister {
    public static void main(String[] args) {
        for(int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
