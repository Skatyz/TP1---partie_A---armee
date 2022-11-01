public class IntelligentArmy extends Army{
    public IntelligentArmy(String armyName, int strength, int dexterity, int intelligence, int focus) {
        super(armyName, strength, dexterity, intelligence, focus);
    }

    public void takeDamage(int attackPoints){
        setHealthPoints(getHealthPoints() - (attackPoints/2));
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
