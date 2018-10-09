package designpatterns.factoryMethod;

/**
 * @Author: Frank
 * @Description: 文件日志记录器工厂类
 * @Date: Create in  2018/10/9 9:48 PM
 */
public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger=new FileLogger();
        return logger;
    }
}
