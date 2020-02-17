package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectToCount == objectArray[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] buffer = new Object[objectArray.length];
        int j = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToRemove){
            }
            else {
                buffer[j] = objectArray[i];
                j++;
            }
        }
        Object[] output = new Object[j];
        for (int k = 0; k < j; k++) {
            output[k] = buffer[k];
        }
        return output;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object common = new Object[0];
        Object tempObject;
        int count = 1;
        int tempCount;
        for (int i = 0; i < objectArray.length; i++) {
            tempObject = objectArray[i];
            tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (tempObject == objectArray[j]){
                    tempCount++;
                }
                else if (tempCount > count){
                    common = tempObject;
                    count = tempCount;
                }
            }
        }
        return common;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = new Object[0];
        Object tempObject;
        int minCount = 1;
        int tempCount;
        for (int i = 0; i < objectArray.length; i++) {
            tempObject = objectArray[i];
            tempCount = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (tempObject == objectArray[j]){
                    tempCount++;
                }
            }
            if (tempCount < minCount){
                minCount = tempCount;
                leastCommon = tempObject;
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] merge = new Object[objectArray.length + objectArrayToAdd.length];
        int k = 0;
        for (int i = 0; i < objectArray.length; i++) {
            merge[k++] = objectArray[i];
        }
        for (int j = 0; j < objectArrayToAdd.length; j++) {
            merge[k++] = objectArray[j];
        }
        return merge;
    }
}
