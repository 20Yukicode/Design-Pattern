package moleFarm.concrete.seed;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 茄子种子
 */
public class EggplantSeed extends AbstractSeed implements Cloneable{
    /**
     * 名字
     */
    private  final String name = "茄子";
    /**
     颜色
     */
    private final Color color = Color.BROWN;
    /**
     * 大小
     */
    private final Size size = Size.MEDIUM;
    /**
     * 生长周期
     */
    private final String growthCycle = "100天";
    /**
     * 价格
     */
    private final Double price = 5.0;

    private EggplantSeed(String name, Color color, Size size, String growthCycle, Double price) {
        super(name,color,size,growthCycle,price);
    }


    /**
     * 原型模式，重写clone方法
     * @return
     */
    @Override
    public Object clone() {
        EggplantSeed eggplantSeed = new EggplantSeed(this.name, this.color, this.size, this.growthCycle, this.price);
        return eggplantSeed;
    }
}
