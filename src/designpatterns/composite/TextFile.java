package designpatterns.composite;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 22:01
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
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
        System.out.println("-----对文本文件" + name + "进行杀毒中--------");
    }
}
