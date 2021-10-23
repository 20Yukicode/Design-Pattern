package moleFarm.pattern.adapter;

public class WeatherAdapter extends Weather implements Target {
    @Override
    public Double getMoleDou() {
        return null;
    }

    @Override
    public void setMoleDou(Double money) {

    }

    @Override
    public String getWeather() {
        return getWeatherStatus();
    }
}
