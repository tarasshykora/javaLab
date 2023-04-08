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
public class CommercialDishwasher extends Dishwasher{
    private int glassesPerHour;
    private static final int POWER_CONSUMPTION_PER_CYCLE = 1500;

    public float getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
    public CommercialDishwasher(String model, boolean isOn, double width,
                                double height, double electricityConsumptionPerCycle, int glassesPerHour){
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.glassesPerHour = glassesPerHour;
     }

}
