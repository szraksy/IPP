package com.sezeraksoy.console.algorithms;

import com.sezeraksoy.console.collections.Enumerable;

public class NullAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        System.out.println("Wrong operation selected");
        return 0;
    }
}
