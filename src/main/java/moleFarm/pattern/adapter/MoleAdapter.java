package moleFarm.pattern.adapter;


public class MoleAdapter extends Mole implements Target {

    @Override
    public Double getMoleDou() {
        return getMoney();
    }

    @Override
    public void setMoleDou(Double money) {
        setMoney(money);
    }

    @Override
    public String getWeather() {
        return null;
    }

}
