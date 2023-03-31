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
    private double maxTemperatureOfSterilization;
    private double power;
    private double durationOfOneCycleOfSterilization;

    public float getPowerConsumptionPerCycle(){
        return 2000;
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

