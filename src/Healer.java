public class Healer extends AbstractSquad{

    private int experience;

    public Healer(int experience){
        setExperience(experience);
    }

    public int getPower(Army theArmy, int experience) {
        return theArmy.getFocus() * experience / 20;
    }
    @Override
    public boolean isHealing(){
        return true;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        validateCharacteristic(experience);
        this.experience = experience;
    }
}
