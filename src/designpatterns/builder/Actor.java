package designpatterns.builder;

/**
 * @Author: Frank
 * @Description: 充当复杂产品对象
 * @Date: Create in  2018/10/22 8:11 PM
 */
public class Actor {
    private String type;       //角色类型
    private String sex;        //性别
    private String face;       //脸型
    private String costume;    //服装
    private String hairstyle;  //发型

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
