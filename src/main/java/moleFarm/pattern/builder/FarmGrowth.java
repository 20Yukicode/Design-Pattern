package moleFarm.pattern.builder;

public interface FarmGrowth {
    /**
     * 松土
     */
    void loosenSoil();
    /**
     * 除草
     * @return
     */
    boolean weed();
    /**
     * 浇水
     * @return
     */
    boolean watering();
    /**
     * 施肥
     * @return
     */
    boolean applyFertilizer();
    /**
     * 除虫
     * @return
     */
    boolean disinsection();
}
