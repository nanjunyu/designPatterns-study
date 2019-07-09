package designpatterns.prototype.shallow;

/**
 * @Author: Frank
 * @Description:附件对象
 * @Date: Create in  2018/10/25 9:36 PM
 */
public class Attachment {
    private String name;  //附件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载的附件名称为"+name);
    }
}
