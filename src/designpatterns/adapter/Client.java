package designpatterns.adapter;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 15:54
 */
public class Client {
    public static void main(String[] args) {
        IsUsb isUsb=new Adapter();
        isUsb.isUsb();
    }
}
