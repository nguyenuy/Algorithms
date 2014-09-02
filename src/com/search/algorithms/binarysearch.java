package com.search.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Class Name: Binarysearch.java
 * Description: Binary search searches an array for a number and returns the corresponding
 *              index. The array to be searched is required to be in ascending order in this
 *              case
 * Time Complexity: O(log n)
 *
 */
public class Binarysearch {
    public static void main(String[] args) {
        List<Integer> searchArray = Arrays.asList(1, 5, 7, 8, 34, 59, 106);

        int numberToFind = 81;
        Integer indexFound = binarySearcher(searchArray, numberToFind, 0, searchArray.size()-1);
        System.out.print("Index Found: ");
        System.out.print(indexFound);
    }

    public static Integer binarySearcher(List<Integer> arrayToSearch, Integer numberToFind, Integer iMin, Integer iMax) {
        if (iMax < iMin) {
            return -1;
        } else {
            Integer midpoint = (iMax + iMin)/2;

            if (arrayToSearch.get(midpoint) > numberToFind) {
                return binarySearcher(arrayToSearch, numberToFind, iMin, midpoint-1);
            } else if (arrayToSearch.get(midpoint) < numberToFind) {
                return binarySearcher(arrayToSearch, numberToFind, midpoint+1, iMax);
            } else {
                return midpoint;
            }
        }
    }
}

