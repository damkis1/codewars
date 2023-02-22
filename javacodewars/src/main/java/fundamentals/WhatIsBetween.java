package fundamentals;

import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int size = b - a;
        int [] betweenArray = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            betweenArray[i] = a;
            a++;
        }
        return betweenArray;
    }
    static int[] between2(int a, int b) {
        return rangeClosed(a, b).toArray();
    }
}
