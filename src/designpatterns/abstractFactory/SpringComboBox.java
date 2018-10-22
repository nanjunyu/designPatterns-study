package designpatterns.abstractFactory;

/**
 * @Author: Frank
 * @Description:Spring 组合框类 充当具体的产品
 * @Date: Create in  2018/10/11 8:58 PM
 */
public class SpringComboBox  implements ComboBox{
    @Override
    public void display(){
        System.out.println("显示浅绿色组合框");
    }
}
