package org.example;

import org.example.entities.Product;
import org.example.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        String path = "C:\\Users\\jestevsa\\Documents\\Estudos\\ComparableSuperT\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String productCsv = br.readLine();
            while (productCsv != null) {
                String[] field = productCsv.split(",");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
                productCsv = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}