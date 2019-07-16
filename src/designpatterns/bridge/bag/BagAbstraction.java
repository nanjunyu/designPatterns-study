package designpatterns.bridge.bag;

import designpatterns.bridge.material.Material;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-15 16:58
 */
public abstract  class BagAbstraction {
    protected Material material;

    public void setMaterial(Material material){
        this.material=material;
    }

    public abstract void pack();
}
