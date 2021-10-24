package moleFarm;

import moleFarm.pattern.adapter.Mole;
import moleFarm.pattern.adapter.Target;
import moleFarm.pattern.adapter.WeatherAdapter;
import moleFarm.pattern.iterator.conc.FarmIterator;

import java.util.Scanner;

/**
 * 农场主进程
 */
public class FarmProcess {
    //农场
    private MoleFarm farm=MoleFarm.newInstance();
    //仓库
    private MoleFarmWarehouse warehouse=MoleFarmWarehouse.newInstance();
    //摩尔角色
    private Mole mole;

    private FarmProcess(){}

    private static volatile FarmProcess farmProcess=new FarmProcess();
    public static synchronized FarmProcess newInstance(){
        return farmProcess;
    }
    /**
     * 农场主函数
     */
    public void process(Mole Imole){
        mole=Imole;
        System.out.println("输入y进入农场：");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        while (!str.equals("0")){
            //欢迎辞
            System.out.print("欢迎来到欢乐农场！\n" +
                    "今日天气：");
            //获取今日天气并输出
            Target weather = WeatherAdapter.getInstance();
            System.out.print(weather.getWeather()+"\n");
            System.out.println("请选择您要去的地方：1——农田，2——仓库，0——游戏首页");
            String str1 = input.next();
            //农田模块
            while(str1.equals("1")) {
                //绘制农田状态图
                farm.showFarm();
                System.out.println("请输入1~9查看具体农田块状态，输入0返回农场首页，输入回车选择批量操作：");
                String str2 = input.next();
                while(!str2.equals("0")){
                    //批量操作
                    if(str2.equals("\n")){
                        //建造者模式
                        System.out.println("批量操作");
                    }
                    //单个农田块操作
                    else{
                        //获取农田块编号
                        int index = Integer.parseInt(str2);
                        //获取具体农田块对象
                        FarmIterator iterator = farm.getIterator();
                        MoleFarmBlock block = iterator.getByIndex(index);
                        //控制台输出农田块信息
                        block.getInfo();
                        System.out.println("请选择：0——返回上级，1——种植作物，2——铲除作物，3——收获作物，4——浇水，5——除草，6——除虫，7——施肥");
                        String str3=input.next();
                        if(str3.equals("0"))break;
                        //对作物进行具体操作
                        System.out.println("对作物进行操作");
                    }
                }
            }
            //仓库模块
            while(str1.equals("2")){
                System.out.println("仓库库存状态如下：");
                warehouse.showRepertory();
                System.out.println("请选择操作：0——返回农场首页，1——买入种子，2——卖出作物");
                String str4=input.next();
                while(!str4.equals("0")){
                    switch (str4){
                        case "1":
                            //挑选种类，输入数目，买入种子
                            break;
                        case "2":
                            //挑选种类，输入数目，卖出作物
                            break;
                    }
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        FarmProcess farmProcess = new FarmProcess();
        farmProcess.process(new Mole());
    }
}
