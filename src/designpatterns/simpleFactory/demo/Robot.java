package designpatterns.simpleFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 4:59 PM
 */
public class Robot  implements  ZaoRen{

    public Robot() {
        System.out.println("准备创造一个机器人Robot");
    }

    @Override
    public void create() {
        System.out.println("女娲创造完成了一个机器人");
    }
}
