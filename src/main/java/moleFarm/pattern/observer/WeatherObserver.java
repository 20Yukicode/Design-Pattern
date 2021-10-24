package moleFarm.pattern.observer;

import moleFarm.MoleFarm;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.pattern.adapter.WeatherAdapter;
import moleFarm.pattern.iterator.conc.FarmIterator;

import java.util.List;

public class WeatherObserver {
    private MoleFarm moleFarm;
    private WeatherAdapter weatherAdapter;

    public WeatherObserver(MoleFarm farm){
        this.moleFarm=farm;
    }

    public void observer(){
        weatherAdapter=WeatherAdapter.getInstance();
        if(weatherAdapter.getWeather().equals("雨天")){
            FarmIterator iterator = moleFarm.getIterator();
            while(iterator.hasNext()){
                List<FarmBlockStatus> statusList = iterator.next().getStatusList();
                statusList.remove("干旱");
            }
        }
    }
}
