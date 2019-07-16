package designpatterns.adapter.object;

import designpatterns.adapter.IsTypeC;
import designpatterns.adapter.IsUsb;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 22:18
 */
public class Adapter implements IsUsb {
    private IsTypeC typeC;

    public Adapter(IsTypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void isUsb() {
        typeC.isTypeC();
    }
}
