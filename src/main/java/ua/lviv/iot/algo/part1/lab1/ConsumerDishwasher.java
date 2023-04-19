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
public final class ConsumerDishwasher extends Dishwasher {
    public static final int POWER_CONSUMPTION_PER_CYCLE = 1000;
    private double maxCapacity;
    private double currentCapacity;

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", maxCapacity, currentCapacity";
    }


    public String toCSV() {
        return super.toCSV() + ", " + maxCapacity + "," + currentCapacity;
    }

    public float getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
    public ConsumerDishwasher(final String model, final boolean isOn, final double width, final double height,
                              final double electricityConsumptionPerCycle, final double maxCapacity, final double currentCapacity) {
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

}

