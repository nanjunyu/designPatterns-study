package designpatterns.simpleFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 2:52 PM
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
