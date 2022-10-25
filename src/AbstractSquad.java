public abstract class AbstractSquad implements Squad{
    @Override
    public boolean isDeffensive() {
        return false;
    }

    @Override
    public boolean isOffensive() {
        return false;
    }

    @Override
    public boolean isHealing() {
        return false;
    }
}
