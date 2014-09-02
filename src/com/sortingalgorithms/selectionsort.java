package com.sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: Selectionsort.java
 * Description: SelectionSort sorts an integer array using the SelectionSort Algorithm
 * Time Complexity: O(n^2)
 *
 */
public class Selectionsort {
    public String name = "Selectionsort";
    public String timeComplexity = "n^2";

    public static void main(String[] args) {
        List<Integer> unsortedArray = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
        List<Integer> sortedArray = selectionsorter(unsortedArray);
        String sortedString = new String();
        for (Integer i : sortedArray) {
            String stringToAdd = i.toString();
            sortedString = sortedString + stringToAdd + " ";
        }
        System.out.print("Sorted String: ");
        System.out.print(sortedString);
    }

    public static List<Integer> selectionsorter(List<Integer> arrayToSort) {
        for (int i = 0; i<arrayToSort.size(); i++) {
            //Candidate minimum
            int indexMin = i;

            for (int j = i + 1; j < arrayToSort.size(); j++) {
                if (arrayToSort.get(j) < arrayToSort.get(indexMin)) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arrayToSort.get(i);
                arrayToSort.set(i,arrayToSort.get(indexMin));
                arrayToSort.set(indexMin, temp);
            }
        }
        return arrayToSort;
    }
}