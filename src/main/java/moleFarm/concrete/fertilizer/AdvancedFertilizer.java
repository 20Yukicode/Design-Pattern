package moleFarm.concrete.fertilizer;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.status.Level;

/**
 * 高级化肥
 */
public class AdvancedFertilizer extends AbstractFertilizer {
    public String getName() {
        return name;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public Level getLevel() {
        return level;
    }
}
