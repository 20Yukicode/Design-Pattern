package moleFarm.pattern.adapter;

/**
 * 摩尔角色类
 */
public class Mole {
    /*
    摩尔豆（金币）
     */
    private static Double money;

    /**
     * 获取摩尔豆
     * @return
     */
    public static Double getMoney() {
        return money;
    }

    /**
     * 设置摩尔豆
     * @param money
     */
    public static void setMoney(Double money) {
        money = money;
    }
}
