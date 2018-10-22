package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description: Spring文本框类 充当具体的产品
 * @Date: Create in  2018/10/11 8:57 PM
 */
public class SpringText implements Text {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}
