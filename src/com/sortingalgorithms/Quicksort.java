package com.sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: Quicksort.java
 * Description: Quicksort sorts an integer array using the Quicksort Algorithm
 *              Quicksort is a sort in place algorithm
 * Time Complexity: O(n log n)
 *
 */
public class Quicksort {
    public static void main(String[] args) {
        int a[] = {10,9,8,7,6,5,0,1,2,3,4};

        quickSorter(a, 0, a.length-1);
        System.out.print("Sorted Array: ");
        for (int index : a) {
            System.out.print(a[index] + " ");
        }

    }

    public static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;

        // Pivot is the midpoint
        // Pivot can be improved if randomly select 3 random values and select the median value as the pivot point
        int pivot = arr[(left + right) / 2];

        //Put everything smaller than the pivot in one list and greater than the pivot in another list
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    public static void quickSorter(int[] unsortedArray, int low, int high) {
        //Have to partition into two separate subarrays centered on a pivot
        int index = partition(unsortedArray, low, high);
        if (low < index - 1)
            quickSorter(unsortedArray, low, index - 1);
        if (index < high)
            quickSorter(unsortedArray, index, high);


    }
}
