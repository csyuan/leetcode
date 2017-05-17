package patterns.singleton;

/**
 * Created by hadoop on 17-5-15.
 */
public abstract class AbstractHumanFactory {

    //采用泛型对createHuman的输入参数产生两层限制
    //1.必须是Class类型
    //2.必须是Human的实现类
    public abstract <T extends Human> T createHuman(Class<T> c);
}
