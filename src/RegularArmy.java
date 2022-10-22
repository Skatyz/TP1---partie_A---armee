public class RegularArmy extends Army{
    public RegularArmy(String armyName, int strength, int dexterity, int intelligence, int focus, int healthPoints) {
        super(armyName, strength, dexterity, intelligence, focus, healthPoints);
    }

    @Override
    public boolean isDead(int attackPoints) {
        Army theArmy = null;
        if (theArmy.getHealthPoints() <= 8 && theArmy.getHealthPoints() > 0){
            theArmy.setHealthPoints(theArmy.getHealthPoints() + attackPoints);
            return false;
        } else {
            theArmy.setHealthPoints(theArmy.getHealthPoints() - attackPoints);
        }
        if (theArmy.getHealthPoints() <= 0){
            return true;
        }
    }
}
