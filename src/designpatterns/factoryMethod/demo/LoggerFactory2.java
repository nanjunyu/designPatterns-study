package designpatterns.factoryMethod.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/10 10:21 AM
 */
public abstract class LoggerFactory2 {
    public void writeLog(){
        Logger2 logger=this.createLogger();
        logger.writeLog();
    }

    public abstract Logger2 createLogger();
}
