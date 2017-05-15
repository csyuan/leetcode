package patterns.factory.abstractFactory.spring;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sl YUAN on 2016/7/31.
 */

public class PathXMLAppContext implements BeanFactory {

    private Map<String, Object> container = new HashMap<String, Object>();

    public PathXMLAppContext(String fileName) throws DocumentException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        SAXReader reader = new SAXReader();
        File file = new File(fileName);
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> childElements = root.elements();

        for (Element child : childElements) {
//            List<Attribute> attributeList = child.attributes();
//            for (Attribute attr : attributeList) {
//                System.out.println(attr.getName() + ": " + attr.getValue());
//            }
            String id = child.attributeValue("id");
            String Clazz = child.attributeValue("class");
            Object o = Class.forName(Clazz).newInstance();
            container.put(id,o);
            System.out.println(id + "" + Clazz);
        }
    }

    public Object getBean(String id) {
        return container.get(id);
    }
}
