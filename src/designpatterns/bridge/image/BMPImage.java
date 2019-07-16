package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 16:28
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(fileName + "，格式为BMP");
    }
}
