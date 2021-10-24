package moleFarm.pattern.adapter;

public class WeatherAdapter extends Weather implements Target {
    private WeatherAdapter(){}
    @Override
    public String getWeather() {
        return getWeatherStatus();
    }

    public static WeatherAdapter getInstance(){
        return new WeatherAdapter();
    }
}
