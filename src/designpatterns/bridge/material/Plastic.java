package designpatterns.bridge.material;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 17:09
 */
public class Plastic implements Material {
    @Override
    public void draw() {
        System.out.print("用的塑料袋");
    }
}
