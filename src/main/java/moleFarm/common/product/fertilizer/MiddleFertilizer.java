package moleFarm.common.product.fertilizer;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.status.Level;

/**
 * 中级化肥
 */
public class MiddleFertilizer extends AbstractFertilizer {
    private Double price = 5.0;

    @Override
    public Double getPrice() {
        return price;
    }

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
