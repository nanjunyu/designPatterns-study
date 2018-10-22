package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:Summer按钮类 充当具体的产品
 * @Date: Create in  2018/10/11 9:00 PM
 */
public class SummerButton implements Button{
    @Override
    public void display(){
        System.out.println("显示浅蓝色按钮");
    }
}
