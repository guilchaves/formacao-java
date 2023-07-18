package br.com.guilherme.java.io.test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            System.out.println(line);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String typeAccount = lineScanner.next();
            Integer agency = lineScanner.nextInt();
            Integer number = lineScanner.nextInt();
            String holder = lineScanner.next();
            Double balance = lineScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d0 %08d, %20s: %08.2f %n", typeAccount, agency, number, holder, balance);

            lineScanner.close();
//            String[] values = line.split(",");
//            System.out.println(Arrays.toString(values));
        }

        scanner.close();
    }
}
