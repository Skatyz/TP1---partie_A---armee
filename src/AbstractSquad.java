public abstract class AbstractSquad implements Squad{

    public boolean isDeffensive() {
        return false;
    }


    public boolean isOffensive() {
        return false;
    }


    public boolean isHealing() {
        return false;
    }

    public void validateCharacteristic(int characteristic){
        if (characteristic < 20 || characteristic > 100){
            throw new IllegalArgumentException();
        }
    }
}
