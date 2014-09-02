package com.sortingalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: Bubblesort.java
 * Description: Bubblesort sorts an integer array using the Bubblesort Algorithm
 * Time Complexity: O(n^2)
 *
 */
public class Bubblesort {
    public String name = "Bubblesort";
    public String timeComplexity = "n^2";

    public static void main(String[] args) {
        List<Integer> unsortedArray = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
        List<Integer> sortedArray = bubblesorter(unsortedArray);
        String sortedString = new String();
        for (Integer i : sortedArray) {
            String stringToAdd = i.toString();
            sortedString = sortedString + stringToAdd + " ";
        }
        System.out.print("Sorted String: ");
        System.out.print(sortedString);
    }

    public static List<Integer> bubblesorter(List<Integer> arrayToSort) {
        for (int i = 0; i<arrayToSort.size(); i++) {
            int sortedUntil = 0;
            int j = arrayToSort.size()-1;
            for (; j > sortedUntil; j--) {
                if (arrayToSort.get(j) < arrayToSort.get(j-1)) {
                    int temp = arrayToSort.get(j);
                    arrayToSort.set(j,arrayToSort.get(j-1));
                    arrayToSort.set(j-1,temp);
                }
            }
            sortedUntil++;
        }
        return arrayToSort;
    }
}
