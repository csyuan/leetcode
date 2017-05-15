package patterns.factory.abstractFactory.spring;

//import org.springframework.beans.factory.BeanFactory;
import org.dom4j.DocumentException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sl YUAN on 2016/7/30.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, DocumentException {
//        Properties pros = new Properties();
//        pros.load(Test.class.getClassLoader().getResourceAsStream("uestc\\abstractFactory\\factory\\spring\\spring.properties"));
//        String name = pros.getProperty("VehicleType");
//        System.out.println(name);
//        Object o = Class.forName(name).newInstance();
//        Moveable m = (Moveable)o;
//        m.run();

//        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\Workspace\\Reflection\\src\\main\\java\\edu\\uestc\\abstractFactory\\factory\\spring\\applicationFactory.xml");
//        BeanFactory bf = new ClassPathXmlApplicationContext("uestc\\abstractFactory\\factory\\spring\\applicationFactory.xml");
        BeanFactory bf = new PathXMLAppContext("src/main/java/edu/uestc/abstractFactory/factory/spring/applicationFactory.xml");
        Object o = bf.getBean("v");
        Moveable m = (Moveable)o;
        m.run();

    }
}
