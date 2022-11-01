public class Battle implements Enemy {
    public Battle (Squad prizeForWinner){
        Army army1 = new BruteForceArmy("Army1", 30, 10, 10, 10);
        Army army2 = new IntelligentArmy("Army2", 10, 10, 30, 10);
        if (!army1.isDead() && !army2.isDead()){

        }


    }


    @Override
    public void attacker() {
        Army attackArmy = new Army(attackArmy.getArmyName(), 30, 10, 10, 10) {
            @Override
            public boolean isDead() {
                return false;
            }
        };
        SquadFactory makeSquad = new SquadFactory();
        Squad newSquad = new Squad() {
            @Override
            public int getPower(Army army, int characteristic) {
                getPower(attackArmy, getCharacteristic());
            }

            @Override
            public int getCharacteristic() {
                return getCharacteristic();
            }

            @Override
            public boolean isOffensive() {
                return true;
            }

            @Override
            public boolean isDeffensive() {
                return false;
            }

            @Override
            public boolean isHealing() {
                return false;
            }
        };
        makeSquad.makeSquad(newSquad.getCharacteristic());
    }

    @Override
    public void defender() {
        Army defendArmy = new Army(defendArmy.getArmyName(), 30, 10, 10, 10) {
            @Override
            public boolean isDead() {
                return false;
            }
        };
        SquadFactory makeSquad = new SquadFactory();
        Squad newSquad = new Squad() {
            @Override
            public int getPower(Army army, int characteristic) {
                getPower(defendArmy, getCharacteristic());
            }

            @Override
            public int getCharacteristic() {
                return getCharacteristic();
            }

            @Override
            public boolean isOffensive() {
                return true;
            }

            @Override
            public boolean isDeffensive() {
                return true;
            }

            @Override
            public boolean isHealing() {
                return false;
            }
        };
        makeSquad.makeSquad(newSquad.getCharacteristic());
    }
}
