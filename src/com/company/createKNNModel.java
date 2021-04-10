package com.company;

public abstract class createKNNModel {
    int k;

    public createKNNModel(Distance space, int k) {
    }

    static enum Distance {
        space;

        private Distance() {
        }
    }
}