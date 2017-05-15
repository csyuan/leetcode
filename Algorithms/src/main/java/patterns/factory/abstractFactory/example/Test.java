package patterns.factory.abstractFactory.example;

/**
 * Created by Sl YUAN on 2016/7/30.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory af = new MagicFactory();
        Weapon w = af.createWeapon();
        w.shoot();
        Food f = af.createFood();
        f.getName();
        Vehicle v = af.createVehicle();
        v.run();
    }
}
