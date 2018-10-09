package designpatterns.factoryMethod;

/**
 * @Author: Frank
 * @Description: 数据库日志记录器 充当具体的产品角色
 * @Date: Create in  2018/10/9 9:44 PM
 */
public class DataBaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录器");
    }
}
