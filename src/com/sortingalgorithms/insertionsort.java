package com.sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: insertionsort.java
 * Description: Insertion sort sorts an integer array using the insertion sort algorithm
 * Time Complexity: O(n^2)
 *
 */
public class insertionsort {
    public String name = "Insertion Sort";
    public String timeComplexity = "n^2";

    public static void main(String[] args) {
        List<Integer> unsortedArray = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
        List<Integer> sortedArray = insertionSorter(unsortedArray);
        String sortedString = new String();
        for (Integer i : sortedArray) {
            String stringToAdd = i.toString();
            sortedString = sortedString + stringToAdd + " ";
        }
        System.out.print("Sorted String: ");
        System.out.print(sortedString);
    }

    public static List<Integer> insertionSorter(List<Integer> arrayToSort) {
        for (int j = 1; j < arrayToSort.size(); j++) {
            int key = arrayToSort.get(j);
            int i = j-1;

            while (i>=0 && arrayToSort.get(i) > key) {
                arrayToSort.set(i+1,arrayToSort.get(i));
                i--;
            }
            arrayToSort.set(i+1, key);
        }
        return arrayToSort;
    }

}
