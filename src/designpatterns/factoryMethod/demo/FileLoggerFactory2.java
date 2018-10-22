package designpatterns.factoryMethod.demo;

/**
 * @Author: Frank
 * @Description: 文件日志记录器工厂类
 * @Date: Create in  2018/10/9 9:48 PM
 */
public class FileLoggerFactory2 extends LoggerFactory2{

    @Override
    public Logger2 createLogger() {
        Logger2 logger=new FileLogger2();
        return logger;
    }
}
