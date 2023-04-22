package ua.lviv.iot.algo.part1.manager;

import ua.lviv.iot.algo.part1.lab1.Dishwasher;

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
}