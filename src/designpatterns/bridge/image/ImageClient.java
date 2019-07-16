package designpatterns.bridge.image;

import java.io.File;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 16:34
 */
public class ImageClient {
    public static void main(String[] args) {
        File file = new File("/Users/frank/Desktop/timg.jpeg");
        ImageImp imageImp = new WindowsImageImp();
        Image image = new JPGImage();
        image.setImageImp(imageImp);
        image.parseFile(file.getName());
    }
}
