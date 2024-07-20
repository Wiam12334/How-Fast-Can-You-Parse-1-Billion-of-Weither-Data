import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateCSV1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("data1.csv");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        Random random = new Random();

        for (int i = 0; i < 333333333334; i++) {
            String date = "2024-07-" + (i % 31 + 1);  // Exemple de date
            String city = "City" + (i % 100);  // Exemple de ville
            double temperature = 20 + random.nextDouble() * 10;  // Température aléatoire
            printWriter.println(date + "," + city + "," + temperature);
        }

        printWriter.close();
    }
}
