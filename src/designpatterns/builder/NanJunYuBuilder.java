package designpatterns.builder;

/**  创建一个自己
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-09 17:22
 */
public class NanJunYuBuilder extends ActorBuilder{

    @Override
    protected void buildType() {
        actor.setType("小哥哥");
    }

    @Override
    protected void buildSex() {
        actor.setSex("男");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("nike");
    }

    @Override
    protected void buildHairStyle() {
        actor.setHairstyle("渣男锡纸烫");
    }

    @Override
    protected void buildFace() {
        actor.setFace("帅气");
    }
}
