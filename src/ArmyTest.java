import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void canCreateArmyWithHealthPoints() {
        Army newArmy = new Army("Canada", 16, 5, 9, 10) {
            @Override
            public boolean isDead(int attackPoints) {
                return false;
            }
        };
        final int EXPECTED_HEALTH_POINTS = 160;

        int actualHealthPoints = newArmy.getHealthPoints();

        assertEquals(EXPECTED_HEALTH_POINTS, actualHealthPoints);
    }

}