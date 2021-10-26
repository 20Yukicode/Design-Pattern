package moleFarm.pattern.command.conc;

import moleFarm.MoleFarmWarehouse;
import moleFarm.Shop;
import moleFarm.common.exception.MyException;
import moleFarm.common.product.AbstractFertilizer;

/**
 * 具体命令
 * 仓库向商店发生请求，进货肥料
 */
public class FertilizerCommand {
    /**
     * 命令接收方，商店
     */
    private Shop shop = Shop.newInstance();
    /**
     * 命令发送方，仓库
     */

    private MoleFarmWarehouse moleFarmWarehouse;

    /**
     * 商店接收命令，为仓库买入肥料
     *
     * @param fertilizer
     * @param num
     */
    public void execute(AbstractFertilizer fertilizer, int num) {
        try {
            shop.buyFertilizer(fertilizer, num);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
