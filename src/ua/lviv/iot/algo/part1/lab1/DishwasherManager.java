package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishwasherManager {
    public List<Dishwasher> dishwashers = new LinkedList<>();

    public void addDishwasher(final Dishwasher dishwasher){
        this.dishwashers.add(dishwasher);
    }

    public List<Dishwasher> findElectricityConsumptionGreaterThan(double electricityConsumptionPerCycle){
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getElectricityConsumptionPerCycle() > electricityConsumptionPerCycle)
                .collect(Collectors.toList());
    }

    public List<Dishwasher> GetAllHigherThan(double height) {
        return dishwashers.stream()
            .filter(dishwasher -> dishwasher.getHeight() > height)
            .collect(Collectors.toList());
    }

    public static void main(String[] args){
        DishwasherManager dishwasherManager = new DishwasherManager();
        dishwasherManager.addDishwasher(new ConsumerDishwasher());
        dishwasherManager.addDishwasher(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwasherManager.addDishwasher(new CommercialDishwasher());
        dishwasherManager.addDishwasher(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
        dishwasherManager.addDishwasher(new ClinicalDishwasher());
        dishwasherManager.addDishwasher(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));
        dishwasherManager.addDishwasher(new GlasswareWasher());
        dishwasherManager.addDishwasher(new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117));

        for(Dishwasher dishwasher : dishwasherManager.dishwashers){
            System.out.println(dishwasher);
        }

        System.out.println("\n");

        System.out.println("Dishwashers that consume more electricity than indicated:");
        var dishwasherForElectricity = dishwasherManager.findElectricityConsumptionGreaterThan(2);
        for(Dishwasher dishwasher : dishwasherForElectricity) {
            System.out.println(dishwasherForElectricity);
        }

        System.out.println("\n");

        System.out.println("Dishwashers that have a greater height than indicated: ");
        var dishwasherHigherThan = dishwasherManager.GetAllHigherThan(85);
        for(Dishwasher dishwasher : dishwasherHigherThan){
            System.out.println(dishwasher);
        }

    }

    }

