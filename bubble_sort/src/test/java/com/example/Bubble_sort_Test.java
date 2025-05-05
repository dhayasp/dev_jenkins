package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Bubble_sort_Test {

    @Test
    public void bubblesorttest() {
        int[] arr = {5, 3, 8, 4, 2};
        Bubble_sort.bubblesort(arr);
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, arr);
    }
}


