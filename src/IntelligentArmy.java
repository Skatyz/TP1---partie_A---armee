public class IntelligentArmy extends Army{
    public IntelligentArmy(String armyName, int strength, int dexterity, int intelligence, int focus, int healthPoints) {
        super(armyName, strength, dexterity, intelligence, focus, healthPoints);
    }

    @Override
    public boolean isDead() {
        return false;
    }
}
