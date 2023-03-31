package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ConsumerDishwasher extends Dishwasher {
    private double maxCapacity;
    private double currentCapacity;

    public float getPowerConsumptionPerCycle() {
        return 1000;
    }
    public ConsumerDishwasher(String model, boolean isOn, double width, double height,
                              double electricityConsumptionPerCycle, double maxCapacity, double currentCapacity){
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

}

