package designpatterns.adapter;

/**\
 *  适配器模式
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 15:53
 */
public class Adapter extends IsTypeCImpl implements IsUsb{
    @Override
    public void isUsb() {
        isTypeC();
    }
}
