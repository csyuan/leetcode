package patterns.prototype;

/**
 * Created by hadoop on 17-5-15.
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;

        Mail mail = new Mail(new AdvTemplate());

        mail.setTail("XD");
        mail.setArrayList("ZhangSan");

        while (i < MAX_COUNT) {
            //原型模式
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(" " + i);
            cloneMail.setReceiver(" rec" + i);
            cloneMail.setArrayList("LiSi");
            System.out.println(cloneMail.getArrayList());
//            sendMail(cloneMail);
            i++;
        }

        System.out.println(mail.getArrayList());
        //返回结果[ZhangSan, LiSi, LiSi, LiSi, LiSi, LiSi, LiSi]，浅拷贝
    }

}
