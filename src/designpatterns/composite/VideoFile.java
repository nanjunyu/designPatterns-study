package designpatterns.composite;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 22:01
 */
public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("-----对视频文件" + name + "进行杀毒中--------");
    }
}
