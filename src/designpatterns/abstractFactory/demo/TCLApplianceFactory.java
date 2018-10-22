package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:25 PM
 */
public class TCLApplianceFactory implements ApplianceFactory {
    @Override
    public TV getTv() {
        return new TCLTV();
    }

    @Override
    public AirConditioning getAir() {
        return new TCLairCoditioning();
    }
}
