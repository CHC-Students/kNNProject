package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Driver {

        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("iris.csv");
            Scanner inputFile = new Scanner(file);
            System.out.println("\nIris File");
            System.out.println("----------------");

            while(inputFile.hasNext()) {
                String str = inputFile.nextLine();
                System.out.println(str);
            }
            inputFile.close();

            // create Scanner for iris_test.txt file
            Scanner newFile = new Scanner(new File("iris_test.txt"));

            List<Float> temps = new ArrayList<Float>();

            // while loop
            while (newFile.hasNext()) {
                // find next line
                float line = newFile.nextFloat();
                temps.add(line);
            }
            newFile.close();

            Float[] tempsArray = temps.toArray(new Float[0]);

            for (Float s : tempsArray) {
                System.out.println(s);
            }

        System.out.println("\nNew classification:");
        System.out.println("----------------------");
    }


}