package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClinicalDishwasherTest {
    ClinicalDishwasher clinicalDishwasher;

    @BeforeEach
    void setUp() {
        clinicalDishwasher = new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3);
    }

    @Test
    void getHeaders() {
        var expectedHeaders = "model, isOn, width, height, electricityConsumptionPerCycle, maxTemperatureOfSterilization, power, durationOfOneCycleOfSterilization";
        assertEquals(expectedHeaders, clinicalDishwasher.getHeaders());
    }

    @Test
    void toCSV() {
        var expectedValues = "Maidaid MH525, true, 60.0, 82.0, 2.0, 85.0, 2.5, 3.0";
        assertEquals(expectedValues, clinicalDishwasher.toCSV());
    }

    @Test
    void getPowerConsumptionPerCycle() {
        clinicalDishwasher.getPowerConsumptionPerCycle();
        assertEquals(2000, clinicalDishwasher.getPowerConsumptionPerCycle());
    }
}