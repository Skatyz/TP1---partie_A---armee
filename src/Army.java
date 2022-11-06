public abstract class Army implements Enemy{
    private String armyName;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int focus;
    private int healthPoints;

    private SquadFactory newSquad;
    private Squad anySquad;

    public Army(String armyName, int strength, int dexterity, int intelligence, int focus) {
        ArmyFactory newArmy = new ArmyFactory();

        setArmyName(armyName);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setFocus(focus);

        if (strength + dexterity + intelligence + focus > 100){
            throw new IllegalArgumentException();
        }

        healthPoints = 200 - (strength + dexterity + intelligence + focus);
        setHealthPoints(healthPoints);

        newArmy.makeArmy();

        anySquad.isOffensive();
        anySquad.isDeffensive();
        anySquad.isHealing();

        SquadFactory newSquad = new SquadFactory();
        newSquad.createOffensiveSquad(newSquad.getSquadTypes());
    }

    public boolean isDead() {
        return false;
    }

    @Override
    public Army attacker(Army theAttacker) {
        getNewSquad().createOffensiveSquad(getNewSquad().getSquadTypes());
        int power = anySquad.getPower(theAttacker, getAnySquad().getCharacteristic());
        return theAttacker;
    }

    @Override
    public Army counter(Army theCounter) {
        return theCounter;
    }

    public String getArmyName() {
        return armyName;
    }

    public void setArmyName(String armyName) {
        this.armyName = armyName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Squad getAnySquad() {
        return anySquad;
    }

    public void setAnySquad(Squad anySquad) {
        this.anySquad = anySquad;
    }

    public SquadFactory getNewSquad() {
        return newSquad;
    }

    public void setNewSquad(SquadFactory newSquad) {
        this.newSquad = newSquad;
    }
}
