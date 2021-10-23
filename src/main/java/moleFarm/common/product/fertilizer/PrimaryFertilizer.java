package moleFarm.common.product.fertilizer;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.status.Level;

/**
 * 初级化肥
 */
public class PrimaryFertilizer extends AbstractFertilizer {
    private Double price = 2.0;

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
