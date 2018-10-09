package designpatterns.simpleFactory.demo;

/**
 * @Author: Frank
 * @Description:"造人"工厂类
 * @Date: Create in  2018/10/9 4:36 PM
 */
public class ZaoRenFactory {
    public static ZaoRen getZaoRen(String type) {
        ZaoRen zaoRen = null;
        if ("m".equalsIgnoreCase(type)) {
            zaoRen = new Man();
            System.out.println("初始化男人Man对象");

        } else if ("w".equalsIgnoreCase(type)) {
            zaoRen = new Woman();
            System.out.println("初始化女人Woman对象");
        } else if ("r".equalsIgnoreCase(type)) {
            zaoRen=new Robot();
            System.out.println("初始化机器人Robot对象");
        }
        return zaoRen;
    }

}
