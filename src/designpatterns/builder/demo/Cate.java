package designpatterns.builder.demo;

/**
 * 一碗丰盛的糖醋排骨
 *
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-09 17:33
 */
public class Cate {
    private String food;        //食材，
    private String seasoning;   //调料
    private String practice;    //做法
    private String water;       //水
    private String time;        //时间

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    public String getPractice() {
        return practice;
    }

    public void setPractice(String practice) {
        this.practice = practice;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
