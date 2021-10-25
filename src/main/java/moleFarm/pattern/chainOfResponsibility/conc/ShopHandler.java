package moleFarm.pattern.chainOfResponsibility.conc;

import moleFarm.MoleFarmBlock;
import moleFarm.Shop;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;
import moleFarm.pattern.adapter.Mole;
import moleFarm.pattern.chainOfResponsibility.Handler;

import java.util.List;

public class ShopHandler extends Handler {
    @Override
    public <T extends IProduct> boolean provideSeeds(List<T> list) {
        for(T item:list){
            Double price = item.getPrice();
            if(Mole.getMoney()<price){
                System.out.println("抱歉，摩尔豆不足，进货失败");
                return false;
            }
            else Mole.setMoney(Mole.getMoney()-price);
        }
        System.out.println("进货成功！");
        return true;
    }
}
