package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsumerDishwasherTest {
    @Test
    void getPowerConsumptionPerCycle() {
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher();
        consumerDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1000, consumerDishwasher.getPowerConsumptionPerCycle());
    }
}