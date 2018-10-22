package designpatterns.abstractFactory.demo;

/**
 * @Author: Frank
 * @Description:
 * @Date: Create in  2018/10/17 5:20 PM
 */
public class HaierTV implements TV {
    @Override
    public void function() {
        System.out.println("我是价钱比较贵的海尔电视，我可以给你播放电视剧");
    }
}
