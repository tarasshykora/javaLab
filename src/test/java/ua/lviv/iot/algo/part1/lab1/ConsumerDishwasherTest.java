package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsumerDishwasherTest {

    ConsumerDishwasher consumerDishwasher;

    @BeforeEach
    void setUp() {
        consumerDishwasher = new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12);
    }

    @Test
    void getHeaders() {
        var expectedHeaders = "model, isOn, width, height, electricityConsumptionPerCycle, maxCapacity, currentCapacity";
        assertEquals(expectedHeaders, consumerDishwasher.getHeaders());
    }

    @Test
    void toCSV(){
        var expectedValues = "LG LDTH7972S, true, 60.3, 85.3, 0.74, 14.0, 12.0";
        assertEquals(expectedValues, consumerDishwasher.toCSV());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher();
        consumerDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1000, consumerDishwasher.getPowerConsumptionPerCycle());
    }
}