package ua.lviv.iot.algo.part1.writer;

import ua.lviv.iot.algo.part1.lab1.Dishwasher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DishwasherWriter {
    public static final String FILE_NAME = "dishwasher.csv";
    public String writeToFile(List<Dishwasher> dishwashers) throws IOException {
        if (dishwashers == null || dishwashers.isEmpty()) {
            return null;
        }
        try {
            PrintWriter pw = new PrintWriter(FILE_NAME);
            for (Dishwasher dishwasher : dishwashers) {
                pw.println(dishwasher.getHeaders());
                pw.println(dishwasher.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FILE_NAME;
    }
}

