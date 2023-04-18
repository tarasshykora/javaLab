package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

public final class ClinicalDishwasher extends Dishwasher {
    public static final int POWER_CONSUMPTION_PER_CYCLE = 2000;
    private double maxTemperatureOfSterilization;
    private double power;
    private double durationOfOneCycleOfSterilization;

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", maxTemperatureOfSterilization, power, durationOfOneCycleOfSterilization";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + maxTemperatureOfSterilization + ", " + power + ", " + durationOfOneCycleOfSterilization;
    }

    @Override
    public float getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }

    public ClinicalDishwasher(final String model, final boolean isOn, final double width, final double height, final double electricityConsumptionPerCycle,
                              final double maxTemperatureOfSterilization, final double power,
                              final double durationOfOneCycleOfSterilization) {
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.durationOfOneCycleOfSterilization = durationOfOneCycleOfSterilization;
        this.power = power;
        this.maxTemperatureOfSterilization = maxTemperatureOfSterilization;
    }
}

