package org.example;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] num1 = {-1, -100, 3, 99};
        LoopArraySolution loopArraySolution = new LoopArraySolution();
        loopArraySolution.rotate(num1, 2);
        for (int value : num1) {
            System.out.print(value + " ");
        }
    }
}
