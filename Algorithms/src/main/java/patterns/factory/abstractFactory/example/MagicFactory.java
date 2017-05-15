package patterns.factory.abstractFactory.example;

/**
 * Created by Sl YUAN on 2016/7/30.
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Train();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new Pear();
    }
}
