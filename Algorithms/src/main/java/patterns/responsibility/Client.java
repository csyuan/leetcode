package patterns.responsibility;

/**
 * Created by slyuan on 17-5-17.
 */
public class Client {

    public static void main(String[] args) {


        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new Concretehandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        Response response = handler1.HandleMessage(new Request());

        //还可以对责任链模式进行封装
    }
}
