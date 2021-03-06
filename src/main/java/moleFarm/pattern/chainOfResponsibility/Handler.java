package moleFarm.pattern.chainOfResponsibility;

import moleFarm.Home;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.IProduct;
import moleFarm.pattern.adapter.Mole;

import java.util.List;

/**
 * 职责链模式
 * 任务接收者抽象类
 */
public abstract class Handler {
    protected MoleFarmWarehouse farmWarehouse = Home.farmWarehouse;
    private Handler next;
    protected Mole mole = Home.mole;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract <T extends IProduct> boolean provideSeeds(List<T> list);
}
