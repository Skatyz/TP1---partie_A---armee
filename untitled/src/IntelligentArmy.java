public class IntelligentArmy extends Army{
    public IntelligentArmy(String armyName, int strength, int dexterity, int intelligence, int focus) {
        super(armyName, strength, dexterity, intelligence, focus);
    }

    @Override
    public boolean isDead(int attackPoints) {
        Army theArmy = null;
        theArmy.setHealthPoints(theArmy.getHealthPoints() - (attackPoints/2));
        if (theArmy.getHealthPoints() <= 0){
            return false;
        } else {
            return true;
        }
    }
}
