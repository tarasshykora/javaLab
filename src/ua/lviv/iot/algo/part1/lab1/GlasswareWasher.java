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
public class GlasswareWasher extends Dishwasher{
    private boolean hasITLAutomaticDoor;
    private double weight;

    public float getPowerConsumptionPerCycle() {
        return 2000;
    }

    public GlasswareWasher(String model, boolean isOn, double width, double height,
                           double electricityConsumptionPerCycle, boolean hasITLAutomaticDoor, double weight){
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.hasITLAutomaticDoor = hasITLAutomaticDoor;
        this.weight = weight;
    }

}
