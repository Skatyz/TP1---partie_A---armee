public class Sapper extends AbstractSquad{

    private int craziness;

    public Sapper(int craziness){
        setCraziness(craziness);
    }

    public int getPower(Army theArmy, int craziness) {
        return theArmy.getIntelligence() * craziness / 20;
    }

    @Override
    public boolean isDeffensive(){
        return true;
    }
    @Override
    public int getCharacteristic() {
        return craziness;
    }

    public void setCraziness(int craziness) {
        validateCharacteristic(craziness);
        this.craziness = craziness;
    }
}
