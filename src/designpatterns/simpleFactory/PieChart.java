package designpatterns.simpleFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 2:52 PM
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
