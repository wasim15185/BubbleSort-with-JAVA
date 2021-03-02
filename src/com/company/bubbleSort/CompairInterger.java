package com.company.bubbleSort;

public class CompairInterger implements Computations<Number>{

    @Override
    public  boolean Compair(Number a, Number b) {
       return (Integer)a>(Integer) b ;
    }
}
