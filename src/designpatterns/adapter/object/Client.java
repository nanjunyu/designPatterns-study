package designpatterns.adapter.object;

import designpatterns.adapter.IsTypeC;
import designpatterns.adapter.IsTypeCImpl;
import designpatterns.adapter.IsUsb;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 15:54
 */
public class Client {
    public static void main(String[] args) {
        IsTypeC typeC=new IsTypeCImpl();
        IsUsb isUsb=new Adapter(typeC);
        isUsb.isUsb();

        Integer ni=new Integer(47);
        Integer n2=new Integer(47);
        System.out.println(ni==n2);
        System.out.println(ni!=n2);
    }
}
