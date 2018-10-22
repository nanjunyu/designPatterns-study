package designpatterns.builder;

/**
 * @Author: Frank
 * @Description:角色控制器，充当指挥官
 * @Date: Create in  2018/10/22 8:38 PM
 */
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairStyle();
        actor = actorBuilder.createActor();
        return actor;
    }
}
