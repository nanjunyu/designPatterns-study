package designpatterns.factoryMethod;

/**
 * @Author: Frank
 * @Description: 数据库日志记录器工厂类  充当具体工厂角色
 * @Date: Create in  2018/10/9 9:52 PM
 */
public class DataBaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DataBaseLogger();
        return logger;
    }
}
