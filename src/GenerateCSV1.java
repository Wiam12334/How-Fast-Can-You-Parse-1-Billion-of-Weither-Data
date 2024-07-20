import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateCSV1 {
    public static void main(String[] args) {
        Random rand = new Random();
        try (FileWriter writer = new FileWriter("data1.csv")) {
            writer.write("date,city,temperature\n");
            for (long i = 0; i < 333333333; i++) {
                writer.write("2023-01-01,City1," + (rand.nextInt(40) - 10) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
