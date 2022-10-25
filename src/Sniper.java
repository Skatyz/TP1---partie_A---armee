public class Sniper extends AbstractSquad{
    @Override
    public int getPower() {
        return 0;
    }
    @Override
    public boolean isOffensive(){
        return true;
    }
    @Override
    public boolean isDeffensive(){
        return true;
    }
}
