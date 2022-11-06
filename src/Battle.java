public class Battle {
    private Army attacker;
    private Army counter;

    private SquadTypes squadTypeA;
    private SquadTypes squadTypeD;

    private SquadFactory newSquad;

    private Squad squad;

    public Battle (Army attacker, Army defender, SquadTypes squadTypeA, SquadTypes squadTypeD){
        setAttacker(attacker);
        setCounter(defender);
        setSquadTypeA(squadTypeA);
        setSquadTypeD(squadTypeD);
    }

    public void fight(Squad prizeForWinner){
        if (attacker.attacker(getAttacker()).isDead() && !counter.counter(getCounter()).isDead()){
            int attackPower = attacker.getNewSquad().createOffensiveSquad(getSquadTypeA()).getPower(getAttacker(), squad.getCharacteristic());
            int counterPower = counter.getNewSquad().createDefensiveSquad(getSquadTypeD()).getPower(getCounter(), squad.getCharacteristic());

            if (attackPower > counterPower) {
                counter.takeDamage(attackPower);
                attacker.setAnySquad(prizeForWinner);
            }
            else if (attackPower == counterPower){
                counter.setAnySquad(prizeForWinner);
            }
            else{
                attacker.takeDamage(counterPower);
                counter.setAnySquad(prizeForWinner);
            }
        }
    }

    public Army getCounter() {
        return counter;
    }

    public void setCounter(Army counter) {
        this.counter = counter;
    }

    public Army getAttacker() {
        return attacker;
    }

    public void setAttacker(Army attacker) {
        this.attacker = attacker;
    }

    public SquadTypes getSquadTypeA() {
        return squadTypeA;
    }

    public void setSquadTypeA(SquadTypes squadTypeA) {
        this.squadTypeA = squadTypeA;
    }

    public SquadTypes getSquadTypeD() {
        return squadTypeD;
    }

    public void setSquadTypeD(SquadTypes squadTypeD) {
        this.squadTypeD = squadTypeD;
    }
}
