package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 15:55
 */
public class MacOsImageImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix){
        System.out.println("调用macOs系统显示图像");
    }
}
