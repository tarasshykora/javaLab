package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DishwasherTest {
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