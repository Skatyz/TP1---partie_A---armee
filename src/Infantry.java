public class Infantry extends AbstractSquad{
    private int cohesion;

    public Infantry(int cohesion){
        setCohesion(cohesion);
    }
    @Override
    public int getPower(Army theArmy, int cohesion) {
        return theArmy.getDexterity() * cohesion / 20;
    }
    @Override
    public boolean isDeffensive(){
        return true;
    }

    public int getCohesion() {
        return cohesion;
    }

    public void setCohesion(int cohesion) {
        validateCharacteristic(cohesion);
        this.cohesion = cohesion;
    }
}
