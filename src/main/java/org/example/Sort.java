package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to arrray with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
        if(nums[0]>nums[1]){
            int hold = nums[0];
            nums[0]=nums[1];
            nums[1]=hold;
        }
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
//        for(int i = 0; i<array1.length+array2.length-1; i++){
//            if(array1[i]<array2[i]){
//                inputArray[i]=array1[i];
//                inputArray[i+1]=array2[i];
//            }
//            inputArray[i+1]=array1[i];
//            inputArray[i]=array2[i];
//        }

        int i=0;
        int j=0;
        int k=0;

        //while there is still room in LH and RH lists
        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                inputArray[k]=array1[i];
                i++;
                k++;
            }
            if(array1[i]>array2[j]){
                inputArray[k]=array2[j];
                j++;
                k++;
            }
        }

        while(array1.length>array2.length && k<inputArray.length){
            inputArray[k]=array1[i];
            i++;
            k++;
        }
        while(array1.length<array2.length && k<inputArray.length){
            inputArray[k]=array2[j];
            j++;
            k++;
        }
            //compare, put the lowest in te long list
            //push the index for the winner
        //clean out lists into the end of big list
    }
}
