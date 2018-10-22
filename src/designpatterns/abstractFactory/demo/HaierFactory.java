package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:29 PM
 */
public class HaierFactory implements ApplianceFactory {
    @Override
    public TV getTv() {
        return new HaierTV();
    }

    @Override
    public AirConditioning getAir() {
        return new HaierAirCoditioning();
    }
}
