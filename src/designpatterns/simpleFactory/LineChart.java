package designpatterns.simpleFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 2:53 PM
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
