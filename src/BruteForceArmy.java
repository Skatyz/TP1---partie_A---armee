public class BruteForceArmy extends Army {

    public BruteForceArmy(String armyName, int strength, int dexterity, int intelligence, int focus) {
        super(armyName, strength, dexterity, intelligence, focus);
    }

    public void takeDamage(int attackPoints){
        setHealthPoints(getHealthPoints() - attackPoints);
        if (getHealthPoints() <= 0 && attackPoints < 10){
            setHealthPoints(getHealthPoints() + attackPoints);
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
