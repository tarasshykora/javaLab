package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DishwasherManager {
    public List<Dishwasher> dishwashers = new LinkedList<>();

    public List<Dishwasher> findElectricityConsumptionGreaterThan(float electricityConsumptionPerCycle){
        return dishwashers.stream().
                filter(element -> element.getElectricityConsumptionPerCycle() > electricityConsumptionPerCycle).
                collect(Collectors.toList());
    }

    public void addDishwasher(final Dishwasher dishwasher){
        this.dishwashers.add(dishwasher);
    }

    public List<Dishwasher> FindAllWiderAndHigherThan(float width, float height){
        return dishwashers.stream().
                filter(element -> element.getWidth() >= width && element.getHeight() >= height ).
                collect(Collectors.toList());
    }

    public static void main(String[] args){
        DishwasherManager dishwasherManager = new DishwasherManager();
        dishwasherManager.addDishwasher(new ConsumerDishwasher());
        dishwasherManager.addDishwasher(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwasherManager.addDishwasher(new CommercialDishwasher());
        dishwasherManager.addDishwasher(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
        dishwasherManager.addDishwasher(new ClinicalDishwasher());
        dishwasherManager.addDishwasher(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));

        for(Dishwasher dishwasher : dishwasherManager.dishwashers){
            System.out.println(dishwasher);
        }

        System.out.println("Dishwashers that consume more electricity than indicated:");
        var dishwasher1 = dishwasherManager.findElectricityConsumptionGreaterThan(1);
        for(Dishwasher dishwasher : dishwasher1) {
            System.out.println(dishwasher1);
        }

        System.out.println("Dishwasher than higher and wider than indicated: ");

        var dishwasherHeightAndWidth = dishwasherManager.FindAllWiderAndHigherThan(61, 80);
        for(Dishwasher dishwasher : dishwasherHeightAndWidth){
            System.out.println(dishwasherHeightAndWidth);
        }

    }
}
