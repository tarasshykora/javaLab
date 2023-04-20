package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GlasswareWasherTest {

    GlasswareWasher glasswareWasher;

    @BeforeEach
    void setUp() {
        glasswareWasher = new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117);
    }

    @Test
    void getHeaders() {
        var expectedHeaders = "model, isOn, width, height, electricityConsumptionPerCycle, hasITLAutomaticDoor, weight";
        assertEquals(expectedHeaders, glasswareWasher.getHeaders());
    }

    @Test
    void toCSV() {
        var expectedValues = "Glory-2 / F2, true, 80.0, 150.0, 2.54, true, 117.0";
        assertEquals(expectedValues, glasswareWasher.toCSV());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        GlasswareWasher glasswareWasher = new GlasswareWasher();
        glasswareWasher.getPowerConsumptionPerCycle();
        assertEquals(2000, glasswareWasher.getPowerConsumptionPerCycle());
    }
}