package patterns.factory.abstractFactory.example;

/**
 * Created by Sl YUAN on 2016/7/30.
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
    public abstract Food createFood();

}
