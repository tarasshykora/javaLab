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
public final class CommercialDishwasher extends Dishwasher {
    private int glassesPerHour;
    private static final int POWER_CONSUMPTION_PER_CYCLE = 1500;

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", glassesPerHour";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + glassesPerHour;
    }

    @Override
    public float getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
    public CommercialDishwasher(final String model, final boolean isOn, final double width,
                                final double height, final double electricityConsumptionPerCycle, final int glassesPerHour) {
        super(model, isOn, width, height, electricityConsumptionPerCycle);
        this.glassesPerHour = glassesPerHour;
     }

}
