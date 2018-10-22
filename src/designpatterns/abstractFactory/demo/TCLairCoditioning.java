package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:21 PM
 */
public class TCLairCoditioning implements AirConditioning {
    @Override
    public void function() {
        System.out.println("我是价钱便宜的TCL空调，我可以让你很凉快");
    }
}
