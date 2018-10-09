package designpatterns.singleton;

/**
 * @Auther: Frank
 * @Date: 2018/9/5 19:51
 * @Description: 单例模式
 */
public class Singleton {
    //定义静态私有的成员变量
    private static Singleton singleton = null;

    //定义私有的构造函数
    private Singleton() {

    }


    //定义静态共有工厂方法，返回唯一实例
    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
