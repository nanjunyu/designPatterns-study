package designpatterns.simpleFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 4:39 PM
 */
public class Woman implements ZaoRen {

    public Woman() {
        System.out.println("准备创造一个女人Woman");
    }

    @Override
    public void create() {
        System.out.println("女娲创造了一个女人");
    }
}
