package moleFarm;

import moleFarm.common.exception.product.ProductNotFoundException;
import moleFarm.common.exception.product.conc.CropsNotFoundException;
import moleFarm.common.exception.product.conc.FertilizerNotFoundException;
import moleFarm.common.exception.product.conc.SeedNotFoundException;
import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.adapter.Mole;
import moleFarm.pattern.adapter.conc.WeatherAdapter;
import moleFarm.pattern.factory.conc.CropsFactory;
import moleFarm.pattern.factory.conc.FertilizerFactory;
import moleFarm.pattern.factory.conc.SeedFactory;
import moleFarm.pattern.iterator.conc.FarmIterator;

import java.util.Map;
import java.util.Scanner;

/**
 * 农场主进程
 */
public class FarmProcess {
    /*
    农田
     */
    private static MoleFarm farm = MoleFarm.newInstance();
    //仓库
    private static MoleFarmWarehouse warehouse = MoleFarmWarehouse.newInstance();
    /*
    摩尔角色
     */
    private static Mole mole = Mole.getMoleInstance();
    /*
        商店
         */
    private static Shop shop = Shop.newInstance();
    /*
    具体工厂，负责生产种子/作物/肥料
     */
    private static final SeedFactory seedFactory = SeedFactory.newInstance();
    private static final CropsFactory cropFactory = CropsFactory.newInstance();
    private static final FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
    /*
    Map<String,String>，负责将product的中英文名对应
     */
    private static final Map<String, String> map = JsonOp.searchMapper();

    private FarmProcess() {
    }

    private static volatile FarmProcess farmProcess = new FarmProcess();

    public static synchronized FarmProcess newInstance() {
        return farmProcess;
    }

    /**
     * 农田进程
     *
     * @param str2
     */
    public void farmProcess(String str2) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //批量操作
            if ("b".equals(str2)) {
                System.out.println("\n批量操作");
                System.out.println("请输入1选择一键播种，2选择一键收获，0返回上级：");
                String str3 = input.next();
                if ("1".equals(str3)) {
                    System.out.println("请输入想要种植的作物种子");
                    String name = input.next();
                    try {
                        farm.plantBatchSeeds(name);
                    } catch (ProductNotFoundException e) {
                        e.printStackTrace();
                    }
                } else if ("2".equals(str3)) {
                    //一键收获作物并放入仓库
                    if (warehouse.storeToRepository(farm.harvestCrops())) {
                        System.out.println("已为您一键收获作物并放入仓库");
                    }
                } else {
                    break;
                }
            }
            //单个农田块操作
            else {
                //获取农田块编号
                int index = Integer.parseInt(str2) - 1;
                //获取具体农田块对象
                FarmIterator iterator = farm.getIterator();
                MoleFarmBlock block = iterator.getByIndex(index);
                //控制台输出农田块信息
                block.getInfo();
                System.out.println("请选择：0——返回上级，1——种植作物，2——收获作物，3——浇水，4——除草，5——除虫，6——施肥，7——铲除作物");
                String str3 = input.next();
                if ("0".equals(str3)) {
                    break;
                }
                //对作物进行具体操作
                operationSeed(str3, block);
            }
        }
    }

    public void operationSeed(String str3, MoleFarmBlock block) {
        Scanner input = new Scanner(System.in);
        switch (str3) {
            case "1":
                if (block.getSeed() == null) {
                    System.out.println("请输入想要种植的作物种子:(白菜/茄子/水稻/草莓/西瓜/小麦种子）");
                    String seedName = input.next();
                    try {
                        FarmGrowth.plantSeed(seedName, block);
                    } catch (SeedNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("该土地上已有种子，无法继续种植");
                }
                break;
            case "2":
                //收获
                FarmGrowth.harvestCrops(block);
                break;
            case "3":
                //浇水
                FarmGrowth.watering(block);
                break;
            case "4":
                //除草
                FarmGrowth.weed(block);
                break;
            case "5":
                //除虫
                FarmGrowth.disinsection(block);
                break;
            case "6":
                //施肥
                if (block.getSeed() == null) {
                    System.out.println("此处没有种子种植,播种后再施肥效果更佳噢");
                } else if (block.getSeedStatus() == 6 || block.getSeedStatus() == 7) {
                    System.out.println("作物已经成熟,请立即收获");
                } else {
                    System.out.println("请选择肥料:(高级/中级/低级肥料)");
                    String fertilizerName = input.next();
                    try {
                        FarmGrowth.applyFertilizer(fertilizerName, block);
                    } catch (FertilizerNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case "7":
                //铲除作物
                FarmGrowth.eradicateCrops(block);
                break;
            default:
                return;
        }
    }

    /**
     * 仓库进程
     *
     * @param str4
     */
    public void warehouseProcess(String str4) {
        Scanner input = new Scanner(System.in);
        //循环条件
        int cir = 1;
        while (cir == 1) {
            switch (str4) {
                case "1":
                    //挑选种类，输入数目，买入种子
                    System.out.println("请输入想要购买的种子类型，输入0返回上级：");
                    String seedName = input.next();
                    if ("0".equals(seedName)) {
                        cir = 0;
                        break;
                    }
                    String seedClassName = map.get(seedName);
                    System.out.println("请输入想要购买的种子数目：");
                    int seedNum = input.nextInt();
                    try {
                        shop.buySeeds(seedFactory.create(seedClassName), seedNum);
                    } catch (SeedNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    //挑选种类，输入数目，买入肥料
                    System.out.println("请输入想要购买的肥料类型，输入0返回上级：");
                    String fertilizerName = input.next();
                    if ("0".equals(fertilizerName)) {
                        cir = 0;
                        break;
                    }
                    String fertilizerClassName = map.get(fertilizerName);
                    System.out.println("请输入想要购买的肥料数目：");
                    int fertilizerNum = input.nextInt();
                    try {
                        shop.buyFertilizer(fertilizerFactory.create(fertilizerClassName), fertilizerNum);
                    } catch (FertilizerNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    //挑选种类，输入数目，卖出作物
                    System.out.println("请输入想要卖出的作物类型，输入0返回上级：");
                    String cropName = input.next();
                    if (cropName.equals("0")) {
                        cir = 0;
                        break;
                    }
                    String cropClassName = map.get(cropName);
                    System.out.println("请输入想要卖出的作物数目：");
                    int cropNum = input.nextInt();
                    try {
                        shop.sellCrops(cropFactory.create(cropClassName), cropNum);
                    } catch (CropsNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    return;
            }
        }
    }

    /**
     * 农场主函数
     */
    public void process(Mole Imole) {
        mole = Imole;
        System.out.println("输入y进入农场：");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        while (!"0".equals(str)) {
            //欢迎辞
            System.out.print("\n欢迎来到欢乐农场！\n" +
                    "今日天气：");
            //获取今日天气并输出
            WeatherAdapter weatherAdapter = WeatherAdapter.getInstance();
            String weather = weatherAdapter.transfer();
            System.out.print(weatherAdapter.getWeather() + "\n");
            System.out.println("请选择您要去的地方：1——农田，2——仓库，0——游戏首页");
            String str1 = input.next();
            //农田模块
            while ("1".equals(str1)) {
                //绘制农田状态图
                farm.showFarm();
                System.out.println("请输入1~9查看具体农田块状态，输入0返回农场首页，输入b选择批量操作：");
                String str2 = input.next();
                if ("0".equals(str2)) {
                    break;
                }
                farmProcess(str2);
            }
            //仓库模块
            while ("2".equals(str1)) {
                warehouse.showRepertory();
                System.out.println("请选择操作：0——返回农场首页，1——买入种子，2——买入肥料，3——卖出作物");
                String str4 = input.next();
                if ("0".equals(str4)) {
                    break;
                }
                warehouseProcess(str4);
            }
        }
        return;
    }

    public static void main(String[] args) {
        FarmProcess farmProcess = FarmProcess.newInstance();
        mole.setMoney(100.0);
        farmProcess.process(mole);
        return;
    }
}
