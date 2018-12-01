package com.sezeraksoy.console.algorithms;

import com.sezeraksoy.console.collections.Enumerable;

public class SumAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        Enumerable.Iterator<Double> iterator = values.getIterator();
        double sum = 0;

        while (!iterator.isDone()) {
            sum += iterator.current();
            iterator.next();
        }

        return sum;
    }
}
