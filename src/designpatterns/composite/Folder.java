package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 22:01
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> abstractFiles = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        abstractFiles.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        abstractFiles.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return abstractFiles.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("-----对文件夹" + name + "进行杀毒中--------");
        for (AbstractFile abstractFile : abstractFiles) {
            abstractFile.killVirus();
        }
    }
}
