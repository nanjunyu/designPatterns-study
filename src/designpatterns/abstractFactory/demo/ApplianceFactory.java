package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:26 PM
 */
public interface ApplianceFactory {
    public TV getTv();

    public AirConditioning getAir();
}
