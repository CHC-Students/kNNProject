package com.company;

public class TrainSample {
    double[] data = new double[]{1.2, 3.5, 2.7};
    int label = 1;
    TrainSample trainSample;

    public TrainSample(double[] data, int label) {
        this.trainSample = new TrainSample(this.data, this.label);
        this.data = data;
        this.label = label;
    }

    public double getLabel() {

        return label;
    }
}