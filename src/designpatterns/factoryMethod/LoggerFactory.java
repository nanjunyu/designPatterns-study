package designpatterns.factoryMethod;

/**
 * @Author: Frank
 * @Description: 日志记录器工厂接口 充当抽象工厂角色
 * @Date: Create in  2018/10/9 9:46 PM
 */
public interface LoggerFactory {
     public Logger createLogger();
}
