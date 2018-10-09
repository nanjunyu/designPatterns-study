package designpatterns.simpleFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 4:53 PM
 */
public class Client {
    public static void main(String[] args) {
        ZaoRen zaoRen=null;
        zaoRen=ZaoRenFactory.getZaoRen("r");
        zaoRen.create();
    }
}
