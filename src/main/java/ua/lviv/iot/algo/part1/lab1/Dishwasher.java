package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Dishwasher {
    private String model;
    private boolean isOn;
    private double width;
    private double height;
    private double electricityConsumptionPerCycle;

    public String getHeaders() {
        return ", model, isOn, width, height, electricityConsumptionPerCycle";
    }

    public String toCSV() {
        return model + ", " + isOn + ", " + width + ", " +
                height + ", " + electricityConsumptionPerCycle;
    }
    public abstract float getPowerConsumptionPerCycle();

    public Boolean turnOn() {
        return true;
    }

    public Boolean turnOff() {
        return false;
    }
}

