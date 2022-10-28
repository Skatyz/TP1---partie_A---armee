public class ArmyFactory {
    public Army makeArmy(){

        Army newArmy = new Army(makeArmy().getArmyName(), makeArmy().getStrength(), makeArmy().getDexterity(), makeArmy().getIntelligence(), makeArmy().getFocus(), makeArmy().getAnySquad()) {
            @Override
            public boolean isDead(int attackPoints) {
                return false;
            }
        };
        if (newArmy.getStrength() >= newArmy.getDexterity() + 10 && newArmy.getDexterity() + 10 >= newArmy.getFocus()){
            return new BruteForceArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus());
        }
        else if (newArmy.getIntelligence() >= Math.max(newArmy.getStrength(), newArmy.getDexterity()) + 15 && newArmy.getFocus() >= Math.max(newArmy.getStrength(), newArmy.getDexterity())){
            return new IntelligentArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus());
        }
        else if (newArmy.getStrength() >= 20 && newArmy.getDexterity() >= 20 && newArmy.getIntelligence() >= 20 && newArmy.getFocus() >= 20){
            return new RegularArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus());
        }
        else {
            return null;
        }
    }
}
