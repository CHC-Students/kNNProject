package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class kNNModel {
    private int k;
    protected ArrayList<TrainSample> trainData;
    enum Distance {EUCLIDEAN, CITYBLOCK;

        public double compareTo(double distance) {
            return distance;
        }
    }

    public kNNModel(int k) throws FileNotFoundException {
        this.k = k;
    }

    public kNNModel() throws FileNotFoundException {
        this.k = 1;
        this.trainData = this.trainData;
    }

    public abstract double computeDistance(TrainSample x, TrainSample y);

    public void predict(TrainSample sample) {

        ArrayList<double[]> distance = new ArrayList();
        for(TrainSample otherSample: trainData) {
            double space = this.computeDistance(sample, otherSample);
            double[] array = {space, otherSample.getLabel()};
            distance.add(array);
        }

    }
}