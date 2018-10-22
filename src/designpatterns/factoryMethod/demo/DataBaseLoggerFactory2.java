package designpatterns.factoryMethod.demo;

import designpatterns.factoryMethod.DataBaseLogger;
import designpatterns.factoryMethod.Logger;

/**
 * @Author: Frank
 * @Description: 数据库日志记录器工厂类  充当具体工厂角色
 * @Date: Create in  2018/10/9 9:52 PM
 */
public class DataBaseLoggerFactory2 extends LoggerFactory2 {

    @Override
    public Logger2 createLogger() {
        Logger2 logger = new DataBaseLogger2();
        return logger;
    }
}
