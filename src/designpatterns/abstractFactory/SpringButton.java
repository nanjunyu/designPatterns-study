package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description: Spring按钮类 充当具体产品
 * @Date: Create in  2018/10/11 8:56 PM
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
