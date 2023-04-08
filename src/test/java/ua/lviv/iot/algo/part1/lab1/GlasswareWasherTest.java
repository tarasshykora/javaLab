package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlasswareWasherTest {
    @Test
    void TestDefaultConstuctor(){
        GlasswareWasher dishwasher = new GlasswareWasher();
        assertEquals(null, dishwasher.getModel());
        assertEquals(false, dishwasher.isOn());
        assertEquals(0, dishwasher.getWidth());
        assertEquals(0, dishwasher.getHeight());
        assertEquals(0, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(false, dishwasher.isHasITLAutomaticDoor());
        assertEquals(0, dishwasher.getWeight());
    }

    @Test
    void testConstructorWithParameters(){
        GlasswareWasher dishwasher = new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117);
        assertEquals("Glory-2 / F2", dishwasher.getModel());
        assertEquals(true, dishwasher.isOn());
        assertEquals(80, dishwasher.getWidth());
        assertEquals(150, dishwasher.getHeight());
        assertEquals(2.54, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(true, dishwasher.isHasITLAutomaticDoor());
        assertEquals(117, dishwasher.getWeight());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        GlasswareWasher glasswareWasher = new GlasswareWasher();
        glasswareWasher.getPowerConsumptionPerCycle();
        assertEquals(2000, glasswareWasher.getPowerConsumptionPerCycle());
    }
}