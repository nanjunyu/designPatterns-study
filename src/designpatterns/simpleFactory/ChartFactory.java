package designpatterns.simpleFactory;

/**
 * @Author: Frank
 * @Description:图表工厂类
 * @Date: Create in  2018/10/9 2:53 PM
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");

        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");

        }
        return chart;
    }

}
