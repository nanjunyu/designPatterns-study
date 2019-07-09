package designpatterns.prototype.shallow;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/25 9:41 PM
 */
public class PrototypeClient {
    public static void main(String[] args) {
        Attachment attachment=new Attachment();
        WeeklyLog weeklyLog,newLog;
        weeklyLog=new WeeklyLog();
        weeklyLog.setAttachment(attachment);
        newLog=weeklyLog.clone();
        //比较周报
        System.out.println("周报是否相同:"+(weeklyLog==newLog));
        //比较附件
        System.out.println("附件是否相同:"+(weeklyLog.getAttachment()==newLog.getAttachment()));
    }
}
