package moleFarm.pattern.state.conc;

import moleFarm.MoleFarm;
import moleFarm.pattern.state.Weather;

public class RainWeather implements Weather {
    MoleFarm moleFarm;

    public RainWeather(MoleFarm moleFarm) {
        this.moleFarm = moleFarm;
    }

    @Override
    public void watering(MoleFarm moleFarm) {
        System.out.println(this.getClass().getName());
    }
}
