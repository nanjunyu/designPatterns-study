package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:23 PM
 */
public class HaierAirCoditioning implements AirConditioning {
    @Override
    public void function() {
        System.out.println("我是价钱比较贵的海尔空调，我可以让你很凉快");
    }
}