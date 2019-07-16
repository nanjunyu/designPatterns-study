package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 15:53
 */
public class LinuxImageImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("调用Linux系统显示图像");
    }
}
