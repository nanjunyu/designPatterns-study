package designpatterns.factoryMethod.demo;

import designpatterns.factoryMethod.XMLUtil;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/10 10:23 AM
 */
public class Client2 {

    public static void main(String[] args) {
        LoggerFactory2 loggerFactory2;
        loggerFactory2= (LoggerFactory2) XMLUtil.getBean();
        loggerFactory2.writeLog();
    }
}
