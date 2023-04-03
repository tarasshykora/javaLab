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
    private int GlassesPerHour;

    public float getPowerConsumptionPerCycle() {
        return 1500;
    }
    public CommercialDishwasher(String model, boolean isOn, double width,
                                double height, double electricityConsumptionPerCycle, int GlassesPerHour){
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.GlassesPerHour = GlassesPerHour;
     }
}
