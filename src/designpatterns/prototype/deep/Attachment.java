package designpatterns.prototype.deep;

import java.io.Serializable;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/25 9:49 PM
 */
public class Attachment implements Serializable {
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
