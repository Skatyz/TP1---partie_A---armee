public class SquadFactory {

    private SquadTypes squadTypes;

    private Squad squad;
    /*
    public Squad makeSquad(int characteristicPoints){

        if (makeSquad(characteristicPoints).isOffensive() && characteristicPoints < 60){
            return new Cavalry(characteristicPoints);
        }
        else if (makeSquad(characteristicPoints).isOffensive() && characteristicPoints > 60){
            return new Sniper(characteristicPoints);
        }
        if (makeSquad(characteristicPoints).isDeffensive() && characteristicPoints < 60){
            return new Infantry(characteristicPoints);
        }
        else if (makeSquad(characteristicPoints).isDeffensive() && characteristicPoints > 60){
            return new Sapper(characteristicPoints);
        }
        if (makeSquad(characteristicPoints).isHealing()){
            return new Healer(characteristicPoints);
        }
        else{
            return null;
        }
    }
*/
    public Squad createOffensiveSquad(SquadTypes squadType){
        setSquadTypes(squadType);
        return switch(squadType){
            case CAVALRY -> new Cavalry(squad.getCharacteristic());
            case SNIPER -> new Sniper(squad.getCharacteristic());
            case INFANTRY -> throw new IllegalArgumentException();
            case SAPPER -> new Sapper(squad.getCharacteristic());
            case HEALER -> throw new IllegalArgumentException();
        };
    }

    public Squad createDefensiveSquad(SquadTypes squadType){
        return switch(squadType){
            case CAVALRY -> throw new IllegalArgumentException();
            case SNIPER -> new Sniper(squad.getCharacteristic());
            case INFANTRY -> new Infantry(squad.getCharacteristic());
            case SAPPER -> new Sapper(squad.getCharacteristic());
            case HEALER -> throw new IllegalArgumentException();
        };
    }

    public Squad createHealingSquad(SquadTypes squadType){
        return switch(squadType){
            case CAVALRY -> throw new IllegalArgumentException();
            case SNIPER -> throw new IllegalArgumentException();
            case INFANTRY -> throw new IllegalArgumentException();
            case SAPPER -> throw new IllegalArgumentException();
            case HEALER -> new Healer(squad.getCharacteristic());
        };
    }

    public SquadTypes getSquadTypes() {
        return squadTypes;
    }

    public void setSquadTypes(SquadTypes squadTypes) {
        this.squadTypes = squadTypes;
    }
}
