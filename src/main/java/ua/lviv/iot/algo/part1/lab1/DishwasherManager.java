package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class DishwasherManager {
    private final List<Dishwasher> dishwashers = new LinkedList<>();

    public void addDishwasher(final Dishwasher dishwasher){
        this.dishwashers.add(dishwasher);
    }

    public List<Dishwasher> findElectricityConsumptionGreaterThan(double electricityConsumptionPerCycle){
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getElectricityConsumptionPerCycle() > electricityConsumptionPerCycle)
                .collect(Collectors.toList());
    }

    public List<Dishwasher> getAllHigherThan(double height) {
        return dishwashers.stream()
            .filter(dishwasher -> dishwasher.getHeight() > height)
            .collect(Collectors.toList());
    }

    }

