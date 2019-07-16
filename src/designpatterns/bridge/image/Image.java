package designpatterns.bridge.image;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 15:56
 */
public abstract class Image {
    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp){
        this.imageImp=imageImp;
    }

    public abstract void parseFile(String fileName);

}
