package designpatterns.factoryMethod.demo;

/**
 * @Author: Frank
 * @Description: 文件日志记录器  充当具体的产品角色
 * @Date: Create in  2018/10/9 9:44 PM
 */
public class FileLogger2 implements Logger2 {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录器");
    }
}
