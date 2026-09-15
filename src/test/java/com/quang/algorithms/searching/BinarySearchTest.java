package com.quang.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testTargetFoundInMiddleRecursion() {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 8;

        int result = binarySearch.searchRecursion(arr, target);

        assertEquals(3, result, "Should find target 8 at index 3.");
    }

    @Test
    void testTargetNotFoundRecursion() {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 100;

        int result = binarySearch.searchRecursion(arr, target);

        assertEquals(-1, result, "Should return -1 if element is not found in array.");
    }

    @Test
    void testTargetFoundAtEdgesRecursion() {
        int[] arr = {1,3,5,7,9};

        assertEquals(0, binarySearch.searchRecursion(arr, 1), "Should find target 1 at index 0");
        assertEquals(4, binarySearch.searchRecursion(arr, 9), "Should find target 9 at index 4");
    }

    @Test
    void testTargetFoundInMiddle() {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 8;

        int result = binarySearch.search(arr, target);

        assertEquals(3, result, "Should find target 8 at index 3.");
    }

    @Test
    void testTargetNotFound() {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 100;

        int result = binarySearch.search(arr, target);

        assertEquals(-1, result, "Should return -1 if element is not found in array.");
    }

    @Test
    void testTargetFoundAtEdges() {
        int[] arr = {1,3,5,7,9};

        assertEquals(0, binarySearch.search(arr, 1), "Should find target 1 at index 0");
        assertEquals(4, binarySearch.search(arr, 9), "Should find target 9 at index 4");
    }
}
