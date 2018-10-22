package designpatterns.builder;

/**
 * @Author: Frank
 * @Description:恶魔角色建造者，充当具体建造者
 * @Date: Create in  2018/10/22 8:35 PM
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    protected void buildType() {
        actor.setType("恶魔");
    }

    @Override
    protected void buildSex() {
        actor.setSex("妖");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("光头");
    }

    @Override
    protected void buildHairStyle() {
        actor.setHairstyle("光头");
    }

    @Override
    protected void buildFace() {
        actor.setFace("丑陋");
    }
}
