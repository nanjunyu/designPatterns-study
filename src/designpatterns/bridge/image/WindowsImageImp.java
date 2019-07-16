package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 15:52
 */
public class WindowsImageImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("调用windows操作系统显示图像");
    }
}
