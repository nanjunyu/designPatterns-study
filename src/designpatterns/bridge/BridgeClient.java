package designpatterns.bridge;

import designpatterns.bridge.bag.BagAbstraction;
import designpatterns.bridge.bag.MiniBag;
import designpatterns.bridge.material.Material;
import designpatterns.bridge.material.Plastic;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 17:04
 */
public class BridgeClient {
    public static void main(String[] args) {
        //袋子型号
        BagAbstraction bagAbstraction=new MiniBag();
        //袋子材质
        Material material=new Plastic();
        bagAbstraction.setMaterial(material);
        bagAbstraction.pack();
        //开始采摘
    }
}
