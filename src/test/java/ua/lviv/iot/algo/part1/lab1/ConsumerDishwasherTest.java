package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerDishwasherTest {
    @Test
    void TestDefaultConstuctor(){
        ConsumerDishwasher dishwasher = new ConsumerDishwasher();
        assertEquals(null, dishwasher.getModel());
        assertEquals(false, dishwasher.isOn());
        assertEquals(0, dishwasher.getWidth());
        assertEquals(0, dishwasher.getHeight());
        assertEquals(0, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(0, dishwasher.getMaxCapacity());
        assertEquals(0, dishwasher.getCurrentCapacity());
    }

    @Test
    void testConstructorWithParameters() {
        ConsumerDishwasher dishwasher = new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12);
        assertEquals("LG LDTH7972S", dishwasher.getModel());
        assertEquals(true, dishwasher.isOn());
        assertEquals(60.3, dishwasher.getWidth());
        assertEquals(85.3, dishwasher.getHeight());
        assertEquals(0.74, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(14, dishwasher.getMaxCapacity());
        assertEquals(12, dishwasher.getCurrentCapacity());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher();
        consumerDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1000, consumerDishwasher.getPowerConsumptionPerCycle());
    }
}