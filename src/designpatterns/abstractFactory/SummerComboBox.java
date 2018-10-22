package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:Summer组合框类 充当具体的产品
 * @Date: Create in  2018/10/11 9:01 PM
 */
public class SummerComboBox implements ComboBox{

    @Override
    public void display(){
        System.out.println("显示浅蓝色组合框");
    }

}
