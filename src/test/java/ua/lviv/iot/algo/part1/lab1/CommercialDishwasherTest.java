package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommercialDishwasherTest {
    @Test
    void TestDefaultConstuctor(){
        CommercialDishwasher dishwasher = new CommercialDishwasher();
        assertEquals(null, dishwasher.getModel());
        assertEquals(false, dishwasher.isOn());
        assertEquals(0, dishwasher.getWidth());
        assertEquals(0, dishwasher.getHeight());
        assertEquals(0, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(0, dishwasher.getGlassesPerHour());
    }

    @Test
    void testConstructorWithParameters(){
        CommercialDishwasher dishwasher = new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972);
        assertEquals("Jackson DishStar HT-E", dishwasher.getModel());
        assertEquals(false, dishwasher.isOn());
        assertEquals(61, dishwasher.getWidth());
        assertEquals(84, dishwasher.getHeight());
        assertEquals(0.74, dishwasher.getElectricityConsumptionPerCycle());
        assertEquals(972, dishwasher.getGlassesPerHour());
    }
    @Test
    void getPowerConsumptionPerCycle() {
        CommercialDishwasher commercialDishwasher = new CommercialDishwasher();
        commercialDishwasher.getPowerConsumptionPerCycle();
        assertEquals(1500, commercialDishwasher.getPowerConsumptionPerCycle());
    }

}