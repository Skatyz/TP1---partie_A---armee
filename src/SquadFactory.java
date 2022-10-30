public class SquadFactory {
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
}
