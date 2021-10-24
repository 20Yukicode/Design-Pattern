package moleFarm.pattern.adapter;


public class MoleAdapter extends Mole implements Target {

    private MoleAdapter(){}
    @Override
    public Double getMoleDou() {
        return getMoney();
    }

    @Override
    public void setMoleDou(Double money) {
        setMoney(money);
    }

    public static MoleAdapter getInstance(){
        return new MoleAdapter();
    }
}
