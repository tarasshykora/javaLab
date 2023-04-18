package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClinicalDishwasherTest {
    @Test
    void getPowerConsumptionPerCycle() {
        ClinicalDishwasher clinicalDishwasher = new ClinicalDishwasher();
        clinicalDishwasher.getPowerConsumptionPerCycle();
        assertEquals(2000, clinicalDishwasher.getPowerConsumptionPerCycle());
    }
}