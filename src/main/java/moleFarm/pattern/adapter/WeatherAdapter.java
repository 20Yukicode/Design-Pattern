package moleFarm.pattern.adapter;

public class WeatherAdapter extends Weather implements Target {
    @Override
    public Double getMoleDou() {
        return null;
    }

    @Override
    public String getWeather() {
        return getWeatherstatus();
    }
}
