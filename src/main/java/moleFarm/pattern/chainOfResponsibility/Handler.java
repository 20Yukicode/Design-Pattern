package moleFarm.pattern.chainOfResponsibility;

import moleFarm.MoleFarmBlock;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;

import java.util.List;

public abstract class Handler {
    protected MoleFarmWarehouse farmWarehouse= MoleFarmWarehouse.newInstance();
    private Handler next;
    public void setNext(Handler next){
        this.next=next;
    }
    public Handler getNext(){
        return next;
    }
    //处理请求的方法
    public abstract<T extends IProduct> boolean provideSeeds(List<T> list);
}
