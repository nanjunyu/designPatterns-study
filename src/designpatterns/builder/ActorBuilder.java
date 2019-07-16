package designpatterns.builder;

/**
 * @Author: Frank
 * @Description: ActorBuilder 游戏角色建造者 ，充当抽象建造者
 * @Date: Create in  2018/10/22 8:16 PM
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    protected abstract void buildType();

    protected abstract void buildSex();

    protected abstract void buildCostume();

    protected abstract void buildHairStyle();

    protected abstract void buildFace();

    //工厂方法返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}
