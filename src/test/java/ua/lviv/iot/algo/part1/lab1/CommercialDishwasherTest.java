package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CommercialDishwasherTest {
    CommercialDishwasher commercialDishwasher;

    @BeforeEach
    void setUp() {
        commercialDishwasher = new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972);
    }

    @Test
    void getHeaders() {
        var expectedHeaders = "model, isOn, width, height, electricityConsumptionPerCycle, glassesPerHour";
        assertEquals(expectedHeaders, commercialDishwasher.getHeaders());
    }

    @Test
    void toCSV() {
        var expectedValues = "Jackson DishStar HT-E, false, 61.0, 84.0, 0.74, 972";
        assertEquals(expectedValues, commercialDishwasher.toCSV());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        CommercialDishwasher commercialDishwasher = new CommercialDishwasher();
        commercialDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1500, commercialDishwasher.getPowerConsumptionPerCycle());
    }

}