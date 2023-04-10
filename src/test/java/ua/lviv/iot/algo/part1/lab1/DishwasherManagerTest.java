package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DishwasherManagerTest {
    public DishwasherManager dishwasherManager;

    @BeforeEach
    void setUp() {
        dishwasherManager = new DishwasherManager();
        dishwasherManager.addDishwasher(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwasherManager.addDishwasher(new GlasswareWasher("Glory-2 / F2", true, 80, 201, 2.54, true, 117));
        dishwasherManager.addDishwasher(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));
        dishwasherManager.addDishwasher(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
    }

    @Test
    void findElectricityConsumptionGreaterThan() {
        var dishwashers = dishwasherManager.findElectricityConsumptionGreaterThan(3);
            assertEquals(0, dishwashers.size());

            for (var dishwasher: dishwashers){
                assertTrue(dishwasher.getElectricityConsumptionPerCycle() >= 3);
            }
        }

    @Test
    void getAllHigherThan() {
        var dishwashers = dishwasherManager.getAllHigherThan(200);
        assertEquals(1, dishwashers.size());

        for (var dishwasher : dishwashers) {
            assertTrue(dishwasher.getHeight() > 200);
        }
    }
}