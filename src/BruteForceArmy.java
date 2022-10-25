public class BruteForceArmy extends Army {

    public BruteForceArmy(String armyName, int strength, int dexterity, int intelligence, int focus) {
        super(armyName, strength, dexterity, intelligence, focus);
    }

    @Override
    public boolean isDead(int attackPoints) {
        Army theArmy = null;
        theArmy.setHealthPoints(theArmy.getHealthPoints() - attackPoints);
        if (theArmy.getHealthPoints() <= 0 && attackPoints < 10){
            theArmy.setHealthPoints(theArmy.getHealthPoints() + attackPoints);
            return false;
        } else {
            return true;
        }
    }
}
