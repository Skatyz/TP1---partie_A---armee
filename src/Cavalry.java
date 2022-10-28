public class Cavalry extends AbstractSquad{

    private int impact;
    public Cavalry(int impact){
        setImpact(impact);
    }
    @Override
    public int getPower(Army theArmy, int impact) {
        return theArmy.getStrength() * impact / 20;
    }


    @Override
    public boolean isOffensive(){
        return true;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        validateCharacteristic(impact);
        this.impact = impact;
    }
}
