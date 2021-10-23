package moleFarm.pattern.Command.conc;

import moleFarm.MoleFarmWarehouse;
import moleFarm.Shop;
import moleFarm.common.product.AbstractFertilizer;

/**
 * 具体命令
 * 仓库向商店发生请求，进货肥料
 */
public class FertilizerCommand {
    //命令接收方，商店
    private Shop shop;
    //命令发送方，仓库
    private MoleFarmWarehouse moleFarmWarehouse;

    FertilizerCommand(MoleFarmWarehouse moleFarmWarehouse){
        shop = new Shop(moleFarmWarehouse);
    }
    //商店接收命令，为仓库买入肥料
    public void execute(AbstractFertilizer fertilizer, int num){
        shop.BuyFertilizer(fertilizer,num);
    }

}
