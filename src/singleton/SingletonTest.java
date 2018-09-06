package singleton;

/**
 * @Auther: Frank
 * @Date: 2018/9/5 19:57
 * @Description:
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        if(singleton1==singleton2){
            System.out.println("两个对象 是相同实例");
        }else{
            System.out.println("两个对象 是不同实例");
        }
    }
}
