
## Objective

The objective of this task was to learn how to read data from a file, process it, and write the result to another file in Java. The focus was on **file handling**, **parsing CSV data**, and **filtering using conditions**.

## Tools Used

* Java (JDK)
* IDE: IntelliJ IDEA
* CSV file



1. **Created a sample CSV file**

   * Prepared a CSV file containing product names and prices.
   * Ensured the data was structured with a header row and comma-separated values.

2. **Read data from the CSV file**

   * Used `BufferedReader` to read the file line by line.
   * Skipped the header row and processed only the product data.

3. **Parsed and filtered data**

   * Split each line by comma to separate product name and price.
   * Converted price from string to numeric (`double`).
   * Applied a condition to select products with price greater than a specific value.

4. **Wrote filtered data to a new CSV file**

   * Used `FileWriter` to create a new CSV file.
   * Wrote the filtered products into this new file.

5. **Verified the process**

   * Printed a success message once the file was created.
   * Ensured that only the filtered data was written correctly.



---
