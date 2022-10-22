public class ArmyFactory {
    public Army makeArmy(){
        Army newArmy = null;

        if (newArmy.getStrength() >= newArmy.getDexterity() + 10 && newArmy.getDexterity() + 10 >= newArmy.getFocus()){
            return new BruteForceArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus(), newArmy.getHealthPoints());
        }
        else if (newArmy.getIntelligence() >= Math.max(newArmy.getStrength(), newArmy.getDexterity()) + 15 && newArmy.getFocus() >= Math.max(newArmy.getStrength(), newArmy.getDexterity())){
            return new IntelligentArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus(), newArmy.getHealthPoints());
        }
        else if (newArmy.getStrength() >= 20 && newArmy.getDexterity() >= 20 && newArmy.getIntelligence() >= 20 && newArmy.getFocus() >= 20){
            return new RegularArmy(newArmy.getArmyName(), newArmy.getStrength(), newArmy.getDexterity(), newArmy.getIntelligence(), newArmy.getFocus(), newArmy.getHealthPoints());
        }
        else {
            return null;
        }
    }
}
