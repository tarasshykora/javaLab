package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DishwasherTest {

    Dishwasher consumerDishwasher;

    @BeforeEach
    void setUp() {
        consumerDishwasher = new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12);
    }

    @Test
    void getHeaders() {
        Dishwasher dishwasher = new ConsumerDishwasher();
        var expectedHeaders = "model, isOn, width, height, electricityConsumptionPerCycle, maxCapacity, currentCapacity";
        assertEquals(expectedHeaders, dishwasher.getHeaders());
    }

    @Test
    void toCSV() {
        var expectedValues = "LG LDTH7972S, true, 60.3, 85.3, 0.74, 14.0, 12.0";
        assertEquals(expectedValues, consumerDishwasher.toCSV());
    }

    @Test
    void turnOn() {
        Dishwasher dishwasher = new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12);
        dishwasher.turnOn();
        assertTrue(dishwasher.isOn());
    }
    @Test
    void turnOff() {
        Dishwasher dishwasher = new ConsumerDishwasher("LG LDTH7972S", false, 60.3, 85.3, 0.74, 14, 12);
        dishwasher.turnOff();
        assertFalse(dishwasher.isOn());
    }

}