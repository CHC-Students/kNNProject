package com.company;

import java.io.FileNotFoundException;

public abstract class computeDistance extends kNNModel {
    public computeDistance() throws FileNotFoundException {
        super();
    }

    private double euclidean(double[] x, double[] y) {
        int elements = x.length;
        double distance = 0;

        // for loop to count all elements with euclidean formula
        for(int i = 0; i < elements; ++i) {
            distance += Math.pow(Math.abs(x[i] - y[i]), 2);
        }

        return Math.sqrt(Distance.EUCLIDEAN.compareTo(distance));
    }

    private double cityBlock(double[] x, double[] y) {
        int elements = x.length;
        double distance = 0;

        // for loop to count all elements with cityBlock formula
        for(int i = 0; i < elements; ++i) {
            distance += Math.pow(Math.abs(x[i] - y[i]), 2);
        }

        return Distance.CITYBLOCK.compareTo(distance);
    }
}