package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:Summer 文本框类 充当具体的产品
 * @Date: Create in  2018/10/11 9:00 PM
 */
public class SummerText implements Text {
    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框");
    }
}
