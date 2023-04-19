package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public final class DishwasherManager {
     private static final List<Dishwasher> dishwashers = new LinkedList<>();

    public void addDishwasher(final Dishwasher dishwasher) {
        this.dishwashers.add(dishwasher);
    }

    public List<Dishwasher> findElectricityConsumptionGreaterThan(final double electricityConsumptionPerCycle) {
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getElectricityConsumptionPerCycle() > electricityConsumptionPerCycle)
                .collect(Collectors.toList());
    }

    public List<Dishwasher> getAllHigherThan(final double height) {
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getHeight() > height)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        DishwasherManager dishwasherManager = new DishwasherManager();
        dishwasherManager.addDishwasher(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwasherManager.addDishwasher(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
        dishwasherManager.addDishwasher(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));
        dishwasherManager.addDishwasher(new GlasswareWasher("Glory-2 / F2", true, 80, 150, 2.54, true, 117));

        for(Dishwasher dishwasher : dishwasherManager.dishwashers) {
            System.out.println(dishwasher);
        }

        System.out.println("\nDishwashers that consume more electricity than indicated:");
        dishwasherManager.findElectricityConsumptionGreaterThan(2).forEach(
                System.out::println);

        System.out.println("\nDishwashers that higher than indicated: ");
        dishwasherManager.getAllHigherThan(85).forEach(System.out::println);

        DishwasherWriter dishwasherWriter = new DishwasherWriter();
        dishwasherWriter.writeToFile(dishwashers);
    }
}

