package designpatterns.abstractFactory.demo;

import designpatterns.abstractFactory.demo.XMLUtil;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:38 PM
 */
public class Client {
    public static void main(String[] args) {
        ApplianceFactory applianceFactory;
        applianceFactory = (ApplianceFactory) XMLUtil.getBean();
        AirConditioning airConditioning;
        airConditioning = applianceFactory.getAir();
        TV tv;
        tv = applianceFactory.getTv();
        airConditioning.function();
        tv.function();
    }
}
