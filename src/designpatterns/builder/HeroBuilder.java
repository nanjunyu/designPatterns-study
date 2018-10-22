package designpatterns.builder;

/**
 * @Author: Frank
 * @Description: 英雄角色建造者，充当具体建造者
 * @Date: Create in  2018/10/22 8:23 PM
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    protected void buildType() {
        actor.setType("英雄");
    }

    @Override
    protected void buildSex() {
        actor.setSex("男");
    }

    @Override
    protected void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    protected void buildHairStyle() {
        actor.setHairstyle("飘逸");
    }

    @Override
    protected void buildFace() {
        actor.setFace("英俊");
    }
}
