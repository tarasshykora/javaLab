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
public class Dishwasher {
    private String model;
    private float maxCapacity;
    private float currentCapacity;
    private boolean isOn;
    private static Dishwasher instance = new Dishwasher();

    public void loadDishes(int count){
        if (currentCapacity + count > maxCapacity){
        }
        else {
            maxCapacity += count;
        }
    }

    public void cleandDishes(){
        Dishwasher count = null;
    }

    public Boolean turnOn(){
        return true;
    }

    public Boolean turnOff() {
        return false;
    }

    public static Dishwasher getInstance(){
        return instance;
    }

    public static void main(String[] args){
        Dishwasher[] objArray = {new Dishwasher(), new Dishwasher("Bosch series 4", 14, 7, true), getInstance(), getInstance() };
        for(Dishwasher dishwasher: objArray){
            System.out.println(dishwasher);
        }
    }
}
