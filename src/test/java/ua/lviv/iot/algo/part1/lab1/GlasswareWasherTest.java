package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GlasswareWasherTest {
    @Test
    void getPowerConsumptionPerCycle() {
        GlasswareWasher glasswareWasher = new GlasswareWasher();
        glasswareWasher.getPowerConsumptionPerCycle();
        assertEquals(2000, glasswareWasher.getPowerConsumptionPerCycle());
    }
}