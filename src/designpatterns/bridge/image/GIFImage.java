package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 16:28
 */
public class GIFImage extends Image {

    @Override
    public  void parseFile(String filename){
        Matrix matrix=new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(filename+",文件格式为GIF");
    }

}
