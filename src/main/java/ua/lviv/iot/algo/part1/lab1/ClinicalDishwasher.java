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

public class ClinicalDishwasher extends Dishwasher {
    public static final int POWER_CONSUMPTION_PER_CYCLE = 2000;
    private double maxTemperatureOfSterilization;
    private double power;
    private double durationOfOneCycleOfSterilization;

    public float getPowerConsumptionPerCycle(){
        return POWER_CONSUMPTION_PER_CYCLE;
    }

    public ClinicalDishwasher(String model, boolean isOn, double width, double height, double electricityConsumptionPerCycle,
                              double maxTemperatureOfSterilization, double power,
                              double durationOfOneCycleOfSterilization){
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.durationOfOneCycleOfSterilization = durationOfOneCycleOfSterilization;
        this.power = power;
        this.maxTemperatureOfSterilization = maxTemperatureOfSterilization;
    }
}

