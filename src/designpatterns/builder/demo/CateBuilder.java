package designpatterns.builder.demo;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-09 17:43
 */
public abstract class CateBuilder {
    Cate cate = new Cate();

    abstract void buildFoot();

    abstract void buildWater();

    abstract void buildSeasoning();

    abstract void buildPractice();

    abstract void buildTime();

    public Cate cooking() {
        this.buildFoot();
        this.buildWater();
        this.buildSeasoning();
        this.buildPractice();
        this.buildTime();
        return cate;
    }

}
