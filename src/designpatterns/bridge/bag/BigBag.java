package designpatterns.bridge.bag;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 16:57
 */
public class BigBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一大袋");
    }
}
