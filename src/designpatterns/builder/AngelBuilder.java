package designpatterns.builder;

/**
 * @Author: Frank
 * @Description: 天使角色建造者，充当具体建造者
 * @Date: Create in  2018/10/22 8:29 PM
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    protected void buildType() {
        actor.setType("天使");
    }

    @Override
    protected void buildSex() {
        actor.setSex("女");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    protected void buildHairStyle() {
        actor.setHairstyle("披肩长发");
    }

    @Override
    protected void buildFace() {
        actor.setFace("漂亮");
    }
}
