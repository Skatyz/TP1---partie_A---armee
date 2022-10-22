public abstract class Army {
    private String armyName;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int focus;
    private int healthPoints;

    public Army(String armyName, int strength, int dexterity, int intelligence, int focus, int healthPoints) {
        ArmyFactory newArmy = new ArmyFactory();
        this.armyName = armyName;

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
}
