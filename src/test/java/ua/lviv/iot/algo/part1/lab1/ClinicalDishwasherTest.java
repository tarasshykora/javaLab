package ua.lviv.iot.algo.part1.lab1;

import com.jparams.verifier.tostring.ToStringVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClinicalDishwasherTest {

    @Test
    void TestToString(){
        ToStringVerifier.forClass(ClinicalDishwasher.class).verify();
    }

    @Test
    void TestNoArgsConstuctor(){
        ClinicalDishwasher dishwasher = new ClinicalDishwasher();
        assertEquals(null, dishwasher.getModel());
        assertEquals(false, dishwasher.isOn());
        assertEquals(0, dishwasher.getWidth());
        assertEquals(0, dishwasher.getHeight());
        assertEquals(0, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(0, dishwasher.getMaxTemperatureOfSterilization());
        assertEquals(0, dishwasher.getPower());
        assertEquals(0, dishwasher.getDurationOfOneCycleOfSterilization());
    }

    @Test
    void testAllArgsConstructor(){
        ClinicalDishwasher dishwasher = new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3);
        assertEquals("Maidaid MH525", dishwasher.getModel());
        assertEquals(true, dishwasher.isOn());
        assertEquals(60, dishwasher.getWidth());
        assertEquals(82, dishwasher.getHeight());
        assertEquals(2, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(85, dishwasher.getMaxTemperatureOfSterilization());
        assertEquals(2.5, dishwasher.getPower());
        assertEquals(3, dishwasher.getDurationOfOneCycleOfSterilization());
    }
    @Test
    void getPowerConsumptionPerCycle() {
        ClinicalDishwasher clinicalDishwasher = new ClinicalDishwasher();
        clinicalDishwasher.getPowerConsumptionPerCycle();
        assertEquals(2000, clinicalDishwasher.getPowerConsumptionPerCycle());
    }
}