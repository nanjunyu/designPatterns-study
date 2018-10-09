package designpatterns.simpleFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 4:39 PM
 */
public class Man implements ZaoRen {

    public Man() {
        System.out.println("准备创造一个男人Man");
    }

    @Override
    public void create() {
        System.out.println("女娲创造完成了一个男人");
    }
}
