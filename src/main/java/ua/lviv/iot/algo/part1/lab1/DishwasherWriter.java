package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DishwasherWriter {
    public String writeToFile(List<Dishwasher> dishwashers) throws IOException {
        String fileName = "dishwasher.csv";
        if (dishwashers == null || dishwashers.isEmpty()) {
            return null;
        }
        try (PrintWriter pw = new PrintWriter(fileName)) {
            for (Dishwasher dishwasher : dishwashers) {
                pw.println(dishwasher.getHeaders());
                pw.println(dishwasher.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }
}

