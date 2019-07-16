package designpatterns.bridge.material;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 17:03
 */
public class Paper implements Material {
    @Override
    public void draw() {
        System.out.println("用的纸袋");
    }
}
