public abstract class Army {
    private String armyName;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int focus;
    private int healthPoints;

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

        getAnySquad().isOffensive();
        getAnySquad().isDeffensive();
        getAnySquad().isHealing();
    }

    public abstract boolean isDead(int attackPoints);

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
}
