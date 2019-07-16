package designpatterns.prototype.shallow;

import java.util.Date;

/**
 * @Author: Frank
 * @Description: 日报对象  充当原型角色
 * @Date: Create in  2018/10/25 9:35 PM
 */
public class WeeklyLog implements Cloneable{
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

    //使用clone方法实现浅克隆
    public WeeklyLog clone(){
        Object object=null;
        try {
            object=super.clone();
            return (WeeklyLog) object;

        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
