package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.*;
class DishwasherManagerTest {
    DishwasherManager dishwasherManager;

    @BeforeEach
    public void setUp(){
        dishwasherManager = new DishwasherManager();
        List<Dishwasher> dishwashers = new LinkedList<>();
        dishwashers.add(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwashers.add(new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117));
        dishwashers.add(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));
        dishwashers.add(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
    }
    @Test
    void addDishwasher() {
        DishwasherManager dishwasherManager = new DishwasherManager();
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12);
        GlasswareWasher glasswareWasher = new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117);
        ClinicalDishwasher clinicalDishwasher = new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3);
        CommercialDishwasher commercialDishwasher = new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972);
        dishwasherManager.addDishwasher(clinicalDishwasher);
        dishwasherManager.addDishwasher(consumerDishwasher);
        dishwasherManager.addDishwasher(glasswareWasher);
        dishwasherManager.addDishwasher(commercialDishwasher);
        assertNotNull(dishwasherManager);
    }
    @Test
    void findElectricityConsumptionGreaterThan() {
        List<Dishwasher> dishwashers = dishwasherManager.findElectricityConsumptionGreaterThan(3);
        assertEquals(0, dishwashers.size());
        assertTrue(dishwashers.stream().allMatch(dishwasher -> dishwasher.getElectricityConsumptionPerCycle() > 3));
    }
    @Test
    void getAllHigherThan() {
        List<Dishwasher> dishwashers = dishwasherManager.getAllHigherThan(400);
        assertEquals(0, dishwashers.size());
        assertTrue(dishwashers.stream().allMatch(dishwasher -> dishwasher.getHeight() > 400));
    }
}