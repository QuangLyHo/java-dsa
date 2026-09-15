package com.quang.algorithms.searching;

public class BinarySearch {

    public int searchRecursion(int[] arr, int target) {
        return searchRecursionHelper(arr, 0, arr.length-1, target);
    }

    public int searchRecursionHelper(int[] arr, int start, int end, int target) {
        if (end >= start) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) return searchRecursionHelper(arr, mid+1, end, target);
            if (arr[mid] > target) return searchRecursionHelper(arr, start, mid-1, target);
        }

        return -1;
    }

    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }
}
