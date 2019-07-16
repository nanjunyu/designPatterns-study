package designpatterns.bridge.bag;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 17:08
 */
public class MiniBag extends BagAbstraction {
    @Override
    public void pack() {
        System.out.println("采摘水果开始");
        this.material.draw();
        System.out.println("采摘了一mini袋");
    }
}
