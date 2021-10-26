package moleFarm.pattern.chainOfResponsibility.conc;

import moleFarm.common.product.IProduct;
import moleFarm.pattern.chainOfResponsibility.Handler;

import java.util.List;

/**
 * 商店
 * 接收者
 */
public class ShopHandler extends Handler {
    @Override
    public <T extends IProduct> boolean provideSeeds(List<T> list) {
        for (T item : list) {
            Double price = item.getPrice();
            if (mole.getMoney() < price) {
                System.out.println("抱歉，摩尔豆不足，进货失败");
                return false;
            } else {
                mole.setMoney(mole.getMoney() - price);
            }
        }
        System.out.println("进货成功！");
        return true;
    }
}
