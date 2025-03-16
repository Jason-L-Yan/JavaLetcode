package org.example;

public class Algorithm {
    public static void main(String[] args) {
        CitationsSolution canJumpMinSolution = new CitationsSolution();
        int[] prices = {3, 0, 6, 1, 5};
        System.out.println(canJumpMinSolution.hIndex(prices));
    }
}
