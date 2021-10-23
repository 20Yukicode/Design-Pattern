package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;

/**
 * 到时候在使用建造者模式的时候，分为一键种植（只是松土加种植），一键种植（加上浇水和施肥），
 * 一键收获
 */
public abstract class Builder {
    protected MoleFarmBlock farmBlock;
    /**
     * 获取成员变量farm
     * @return
     */
    public MoleFarmBlock getFarmBlock() {
        return farmBlock;
    }
    /**
     * 种植
     */
    public abstract void buildPlantSeed();
    /**
     * 松土
     */
    public abstract void buildLoosenSoil();
    /**
     * 浇水
     */
    public abstract void buildWatering();
    /**
     * 施肥
     */
    public abstract void buildApplyFertilizer();
    /**
     * 除草
     */
    public abstract void buildWeed();
    /**
     * 除虫
     */
    public abstract void buildDisinsection();
}
