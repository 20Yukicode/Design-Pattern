package moleFarm.pattern.command.conc;

import moleFarm.MoleFarmWarehouse;
import moleFarm.Shop;
import moleFarm.common.exception.MyException;
import moleFarm.common.product.AbstractSeed;

/**
 * 具体命令
 * 仓库发送请求，从商店进货种子
 */
public class SeedCommand {
    /**
     * 命令接收方，商店
     */
    private Shop shop = Shop.newInstance();
    /**
     * 命令发送方，仓库
     */
    private MoleFarmWarehouse moleFarmWarehouse;

    /**
     * 商店接收命令，为仓库买入种子
     *
     * @param seed
     * @param num
     */
    public void execute(AbstractSeed seed, int num) {
        try {
            shop.buySeeds(seed, num);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
