package designpatterns.builder.demo;

/**
 * 来一份糖醋排骨
 *
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-09 17:48
 */
public class TangCuPaiGuBuilder extends CateBuilder {
    @Override
    void buildFoot() {
        cate.setFood("猪前排");
    }

    @Override
    void buildWater() {
        cate.setWater("开水");
    }

    @Override
    void buildSeasoning() {
        cate.setSeasoning("一勺料酒、二勺生抽、三勺白糖、四勺米醋");
    }

    @Override
    void buildPractice() {
        cate.setPractice("闷");
    }

    @Override
    void buildTime() {
        cate.setTime("小火20分钟");
    }
}
