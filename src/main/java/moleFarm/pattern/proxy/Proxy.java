package moleFarm.pattern.proxy;

import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.command.Command;
import moleFarm.pattern.command.conc.FertilizerCommand;
import moleFarm.pattern.command.conc.SeedCommand;

/**
 * 代理模式
 */
public class Proxy {
    private static MoleFarmWarehouse warehouse;
    private static FertilizerCommand fertilizerCommand;
    private static SeedCommand seedCommand;
    public static void seedPurchase(AbstractSeed seed, int num){
        seedCommand=new SeedCommand(warehouse);
        seedCommand.execute(seed,num);
    }
    public static void fertilizerPurchase(AbstractFertilizer fertilizer, int num){
        fertilizerCommand=new FertilizerCommand(warehouse);
        fertilizerCommand.execute(fertilizer,num);
    }
}
