package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

class DishwasherWriterTest {

    private DishwasherWriter dishwasherWriter;
    private List<Dishwasher> dishwashers;
    private static final String RESULT_FILE = "dishwasher.csv";
    private static final String EXPECTED_FILE = "expected.csv";

    @BeforeEach
    void setUp() throws IOException {
        dishwasherWriter = new DishwasherWriter();
        dishwashers = new LinkedList<>();
        dishwashers.add(new ConsumerDishwasher("LG LDTH7972S", true, 60.3, 85.3, 0.74, 14, 12));
        dishwashers.add(new GlasswareWasher("Glory-2 / F2", true, 80, 200, 2.54, true, 117));
        dishwashers.add(new ClinicalDishwasher("Maidaid MH525", true, 60, 82, 2, 85, 2.5, 3));
        dishwashers.add(new CommercialDishwasher("Jackson DishStar HT-E", false, 61, 84, 0.74, 972));
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @Test
    void testEmptyWrtite() throws IOException {
        dishwasherWriter.writeToFile(null);
        File file = new File(RESULT_FILE);
        Assertions.assertFalse(file.exists());
    }

    @Test
    void testFileOverride() throws IOException {
        dishwasherWriter.writeToFile(dishwashers);
    }

}