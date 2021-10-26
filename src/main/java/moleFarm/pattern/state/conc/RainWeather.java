package moleFarm.pattern.state.conc;

import moleFarm.MoleFarm;
import moleFarm.MoleFarmBlock;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.pattern.iterator.conc.FarmIterator;
import moleFarm.pattern.state.Weather;

import java.util.List;

public class RainWeather implements Weather {
    @Override
    public void watering(MoleFarm moleFarm) {
        FarmIterator iterator = moleFarm.getIterator();
        while (iterator.hasNext()) {
            MoleFarmBlock next = iterator.next();
            List<FarmBlockStatus> statusList = next.getStatusList();
            //如果存在干旱状态，就把它去掉
            statusList.removeIf(s -> s.equals(FarmBlockStatus.DROUGHT));
        }
    }

    @Override
    public void disinsection(MoleFarm moleFarm) {

    }
}
