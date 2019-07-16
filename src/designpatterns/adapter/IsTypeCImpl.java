package designpatterns.adapter;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 15:53
 */
public class IsTypeCImpl implements IsTypeC {
    @Override
    public void isTypeC() {
        System.out.println("typeC 充电接口");
    }
}
