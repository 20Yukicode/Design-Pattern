package moleFarm.pattern.state.conc;

import moleFarm.MoleFarm;
import moleFarm.MoleFarmBlock;
import moleFarm.pattern.iterator.conc.FarmIterator;
import moleFarm.pattern.state.Weather;

public class SunnyWeather implements Weather {
    @Override
    public void watering(MoleFarm farm) {
        FarmIterator iterator = farm.getIterator();
        while (iterator.hasNext()) {
            MoleFarmBlock next = iterator.next();
            
        }
    }
}
