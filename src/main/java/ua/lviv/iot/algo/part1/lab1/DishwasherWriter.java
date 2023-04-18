package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DishwasherWriter{
    public void writeToFile(List<Dishwasher> dishwashers) throws IOException {
        String fileName = "dishwasher.csv";
        try (PrintWriter pw = new PrintWriter(fileName)) {
            Dishwasher dishwasherType = dishwashers.get(0);
            pw.println(dishwasherType.getHeaders());
            for (Dishwasher dishwasher: dishwashers){
                pw.println(dishwasher.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

