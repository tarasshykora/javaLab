package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CommercialDishwasherTest {
    @Test
    void getPowerConsumptionPerCycle() {
        CommercialDishwasher commercialDishwasher = new CommercialDishwasher();
        commercialDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1500, commercialDishwasher.getPowerConsumptionPerCycle());
    }

}