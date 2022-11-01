import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void canCreateArmyWithHealthPoints() {
        Army newArmy = new BruteForceArmy("Canada", 16, 5, 9, 10);
        final int EXPECTED_HEALTH_POINTS = 160;

        int actualHealthPoints = newArmy.getHealthPoints();

        assertEquals(EXPECTED_HEALTH_POINTS, actualHealthPoints);
    }

    @Test
    void getPower() {
        final int EXPECTED_POWER = 40;
        Squad newSquad = new Cavalry(50);
        Army newArmy = new BruteForceArmy("Canada", 16, 5, 9, 10);

        int power = newSquad.getPower(newArmy, newSquad.getCharacteristic());

        assertEquals(EXPECTED_POWER, power);
    }

}