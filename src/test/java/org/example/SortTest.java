package org.example;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortTest extends TestCase {

    public void testSortTwo() {
        int[] unorderedArray = new int[] {82, 19};
        int[] orderedArray = new int[] {19, 82};
        int[] expectedArray = new int[] {19, 82};
        Sort.sortTwo(unorderedArray);
        assertTrue(Arrays.equals(unorderedArray,expectedArray));
        assertTrue(Arrays.equals(orderedArray,expectedArray));
    }

    public void testMerge() {
        int[] startingArray = new int[] {19,5,34,81,17,22,6};
        int[] leftHalf = new int[] {5,19,34,81};
        int[] rightHalf = new int[] {6,17,22};
        int[] expectedResult = new int[] {5,6,17,19,22,34,81};
        Sort.merge(startingArray,leftHalf,rightHalf);
        assertTrue(Arrays.equals(startingArray, expectedResult));
    }



    public void testMergeSort() {
        int[] startingArray = new int[] {12,15,6,8,3,10,9};
        int[] expectedResult = new int[]{3,6,8,9,10,12,15};
        Sort.mergeSort(startingArray);
        System.out.println(Arrays.toString(startingArray));
        assertTrue(Arrays.equals(startingArray,expectedResult));
        System.out.println(Arrays.toString(startingArray));
    }


}