package moleFarm.common.product.fertilizer;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.Level;
import moleFarm.common.status.SeedStatus;

/**
 * 高级化肥
 */
public class AdvancedFertilizer extends AbstractFertilizer {
    private Double price = 10.0;

    private Level level=Level.HIGH_LEVEL;

    @Override
    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer fertilizerBehavior(int status) {
        return Math.min(status + 3, 7);
    }
    public Level getLevel() {
        return level;
    }
}
