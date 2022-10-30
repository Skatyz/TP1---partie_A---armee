public class Infantry extends AbstractSquad{
    private int cohesion;

    public Infantry(int cohesion){
        setCohesion(cohesion);
    }

    public int getPower(Army theArmy, int cohesion) {
        return theArmy.getDexterity() * cohesion / 20;
    }
    @Override
    public boolean isDeffensive(){
        return true;
    }

    @Override
    public int getCharacteristic() {
        return cohesion;
    }

    public void setCohesion(int cohesion) {
        validateCharacteristic(cohesion);
        this.cohesion = cohesion;
    }
}
