public class SquadFactory {
    public Squad makeSquad(int characteristicPoints){

        if (makeSquad(characteristicPoints).isOffensive()){
            return new Cavalry(characteristicPoints);
            return new Sniper(characteristicPoints);
        }
        if (makeSquad(characteristicPoints).isDeffensive()){
            return new Infantry(characteristicPoints);
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
