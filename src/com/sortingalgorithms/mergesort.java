package com.sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: Mergesort.java
 * Description: Mergesort sorts an integer array using the Mergesort Algorithm
 *              Divide and Conquer Algorithm
 * Time Complexity: O(n log n)
 *
 */
public class Mergesort {
    public String name = "Mergesort";
    public String timeComplexity = "n log n";

    public static void main(String[] args) {
        List<Integer> unsortedArray = Arrays.asList(10,9,8,7);
        List<Integer> sortedArray = mergeSorter(unsortedArray);
        String sortedString = new String();
        for (Integer i : sortedArray) {
            String stringToAdd = i.toString();
            sortedString = sortedString + stringToAdd + " ";
        }
        System.out.print("Sorted String: ");
        System.out.print(sortedString);
    }

    /*
     * Recursively sort an array
     * @return the sorted array
     */
    public static List<Integer> mergeSorter(List<Integer> arrayToSort) {

        //Recursive base case. A list of zero or one elements is sorted
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        //Split Lists into 2 sublists
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        Integer middleIndex = arrayToSort.size() / 2;

        for (int i = 0; i < middleIndex; i++) {
            left.add(arrayToSort.get(i));
        }

        for (int i = middleIndex; i < arrayToSort.size(); i++) {
            right.add(arrayToSort.get(i));
        }

        //Recursively sort both sublists
        left = mergeSorter(left);
        right = mergeSorter(right);

        //Conquer
        return merge(left,right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<Integer>();

        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0 && right.size() > 0) {
                if(left.get(0) <= right.get(0)) {
                    result.add(left.get(0));
                    left.remove(0);
                } else {
                    result.add(right.get(0));
                    right.remove(0);
                }
            }
            else if (left.size() > 0) {
                result.add(left.get(0));
                left.remove(0);
            }
            else if (right.size() > 0) {
                result.add(right.get(0));
                right.remove(0);
            }
        }

        return result;
    }

}
