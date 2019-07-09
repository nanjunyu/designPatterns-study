package designpatterns.prototype.deep;

import designpatterns.prototype.deep.Attachment;

import java.io.*;
import java.util.Date;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/25 9:50 PM
 */
public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name;
    private Date date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @Author: Frank
     * @Description:使用序列化技术实现深克隆
     * @Date: Create in  2018/10/25 9:53 PM
     * @params:
     * @return:
     */
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (WeeklyLog) objectInputStream.readObject();
    }
}
