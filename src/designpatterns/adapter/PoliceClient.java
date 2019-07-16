package designpatterns.adapter;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 11:00
 */
public class PoliceClient {
    public static void main(String[] args) {
        CarController carController=new PoliceCarAdapter();
        carController.move();
        carController.twinkle();
        carController.phonate();
    }
}
