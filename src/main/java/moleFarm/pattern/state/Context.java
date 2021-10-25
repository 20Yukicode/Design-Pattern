package moleFarm.pattern.state;

import moleFarm.MoleFarm;

public class Context {
    private Weather weather;

    private MoleFarm moleFarm = MoleFarm.newInstance();

    public Context(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        System.out.println("当前状态为" + weather);
        this.weather = weather;
    }

    public void watering() {
        weather.watering(moleFarm);
    }
}
