package moleFarm.pattern.command.conc;

import moleFarm.MoleFarmWarehouse;
import moleFarm.Shop;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.utils.MyException;

/**
 * 具体命令
 * 仓库发送请求，从商店进货种子
 */
public class SeedCommand {
    //命令接收方，商店
    private Shop shop;
    //命令发送方，仓库
    private MoleFarmWarehouse moleFarmWarehouse;

    public SeedCommand(MoleFarmWarehouse moleFarmWarehouse){
        shop = new Shop(moleFarmWarehouse);
    }
    //商店接收命令，为仓库买入种子
    public void execute(AbstractSeed seed,int num){
        try {
            shop.buySeeds(seed,num);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
