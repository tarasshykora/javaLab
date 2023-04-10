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
public final class GlasswareWasher extends Dishwasher {

    private boolean hasITLAutomaticDoor;
    private double weight;
    public static final int POWER_CONSUMPTION_PER_CYCLE = 2000;

    @Override
    public float getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }

    public GlasswareWasher(final String model, final boolean isOn, final double width, final double height,
                           final double electricityConsumptionPerCycle, final boolean hasITLAutomaticDoor, final double weight) {
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.hasITLAutomaticDoor = hasITLAutomaticDoor;
        this.weight = weight;
    }

}
