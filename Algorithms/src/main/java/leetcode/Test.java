package leetcode;

/**
 * Created by slyuan on 17-4-20.
 */
public class Test {
    public static void main(String[] args) {
        City city = new City();
        city.value();
    }


}

class Country {
    String name;
    void value() {
        name="China";
    }
}

class City extends Country {
    String name;

    @Override
    void value() {
        name = "Chengdu";
        super.value(); //变量初始化
        System.out.println(name);
        System.out.println(super.name);
    }
}

