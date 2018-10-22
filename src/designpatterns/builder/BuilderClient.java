package designpatterns.builder;

/**
 * @Author: Frank
 * @Description: 客户端测试类
 * @Date: Create in  2018/10/22 8:42 PM
 */
public class BuilderClient {
    public static void main(String[] args) {
        ActorBuilder actorBuilder;
        actorBuilder = (ActorBuilder) XMLUtil.getBean();
        ActorController actorController = new ActorController();
        Actor actor;
        actor = actorController.construct(actorBuilder);

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
