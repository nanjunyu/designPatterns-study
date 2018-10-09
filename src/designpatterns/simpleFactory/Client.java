package designpatterns.simpleFactory;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/9 2:51 PM
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
        Chart chartA = ChartFactory.getChart("line");
        chartA.display();
        Chart chartB = ChartFactory.getChart("histogram");
        chartB.display();
    }

}
