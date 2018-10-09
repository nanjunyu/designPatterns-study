package designpatterns.factoryMethod;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 9:56 PM
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory= (LoggerFactory) XMLUtil.getBean();
        logger=loggerFactory.createLogger();
        logger.writeLog();
    }


}
