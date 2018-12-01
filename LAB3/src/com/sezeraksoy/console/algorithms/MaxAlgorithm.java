package com.sezeraksoy.console.algorithms;

import com.sezeraksoy.console.collections.Enumerable;

public class MaxAlgorithm implements Algorithm {
    @Override
    public double compute(Enumerable<Double> values) {
        Enumerable.Iterator<Double> iterator = values.getIterator();

        boolean wasSet = false;
        double max = 0;
        while (!iterator.isDone()){
            if (max < iterator.current() || !wasSet){
                max = iterator.current();
                wasSet = true;
            }
            iterator.next();
        }

        return max;
    }
}
