package designpatterns.composite;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 21:58
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
