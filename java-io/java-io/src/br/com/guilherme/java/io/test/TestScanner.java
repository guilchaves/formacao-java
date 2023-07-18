package br.com.guilherme.java.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String value1 = lineScanner.next();
            Integer value2 = lineScanner.nextInt();
            Integer value3 = lineScanner.nextInt();
            String value4 = lineScanner.next();
            Double value5 = lineScanner.nextDouble();

            System.out.println(value1 + " " + value2 + " "+ value3 + " "+ value4+ " " + value5 );
            lineScanner.close();
//            String[] values = line.split(",");
//            System.out.println(Arrays.toString(values));
        }

        scanner.close();
    }
}
