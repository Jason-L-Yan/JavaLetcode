package org.example;

import java.util.Arrays;

/**
 * H指数
 */
public class CitationsSolution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}
