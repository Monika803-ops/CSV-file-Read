import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFilter {

    public static void main(String[] args) {
        String inputFile = "Book1.csv";            // Input CSV file
        String outputFile = "expensive_products.csv"; // Output CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {

            String line;
            boolean isFirstLine = true; // to handle header

            while ((line = br.readLine()) != null) {
                // Write header to output file
                if (isFirstLine) {
                    fw.write(line + "\n");
                    isFirstLine = false;
                    continue;
                }

                // Split the line by comma
                String[] parts = line.split(",");
                String productName = parts[0];
                double price = Double.parseDouble(parts[1]);

                // Check if price > 1000
                if (price > 1000) {
                    // Write filtered product to new CSV
                    fw.write(productName + "," + price + "\n");
                }
            }

            System.out.println("Filtered products saved successfully in " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
