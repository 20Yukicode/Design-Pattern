package moleFarm.pattern.adapter.conc;

import moleFarm.pattern.adapter.Target;
import moleFarm.pattern.adapter.Weather;

public class WeatherAdapter extends Weather implements Target {
    private WeatherAdapter(){}
    @Override
    public String getWeather() {
        return getWeatherStatus();
    }

    public String transfer(){
        //随机跳转天气
        double ran = Math.random() * 3;
        weatherStatus = ran<1?"晴天":ran<2?"雨天":"阴天";
        return weatherStatus;
    }
    public static WeatherAdapter getInstance(){
        return new WeatherAdapter();
    }
}
