public class RegularArmy extends Army{
    public RegularArmy(String armyName, int strength, int dexterity, int intelligence, int focus) {
        super(armyName, strength, dexterity, intelligence, focus);
    }
    @Override
    public void takeDamage(int attackPoints){
        if (getHealthPoints() <= 8 && getHealthPoints() > 0){
            setHealthPoints(getHealthPoints() + attackPoints);
        } else {
            setHealthPoints(getHealthPoints() - attackPoints);
        }
    }

    @Override
    public boolean isDead() {
        if (getHealthPoints() > 0){
            return false;
        } else {
            return true;
        }
    }
}
