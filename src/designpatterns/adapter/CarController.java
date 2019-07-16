package designpatterns.adapter;

/**
 * 汽车控制类 充当目标抽象类
 *
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 10:52
 */
public abstract class CarController {
    public void move() {
        System.out.println("玩具汽车移动");
    }

    //发出声音
    public abstract void phonate();

    //灯光闪烁
    public abstract void twinkle();



}
