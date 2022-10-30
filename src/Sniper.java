public class Sniper extends AbstractSquad{

    private int accuracy;

    public Sniper(int accuracy){
        setAccuracy(accuracy);
    }

    public int getPower(Army theArmy, int accuracy) {
        return theArmy.getIntelligence() * accuracy / 20;
    }
    @Override
    public boolean isOffensive(){
        return true;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        validateCharacteristic(accuracy);
        this.accuracy = accuracy;
    }
}
