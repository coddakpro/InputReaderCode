//package com.example.serialize;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.IntStream;
//
//public class MinMaxExcercise {
//    public static int[] getMinimum(int[] numbers){
//        int temp=0;
//        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
//        return Arrays.stream(nums)
//                .filter(x-> x== Collections.min(List.of(nums))|| x==Collections.max(List.of(nums)))
//                .limit(2)
//
//                .flatMapToInt(x-> IntStream.of(List.of(nums).indexOf(x)))
//                .toArray();
//           if (arr[0]==list.of(nums).indexOf(Collections.min(List.of()nums)))) swap(arr);
//            return arr;
//    }
//    public static int[]findMinimumAndMaximum(int[] array) throws AmNotMadException {
//        int max = getMax(array);
//        int[] min = getMinimum(array);
//        return new int[]{getIndex(array, max), getIndex(array, min)};
//    }
//
//    public static int getIndex(int[] nums, int num) throws AmNotMadException {
//     for (int counter=0;counter<nums.length;counter++){
//         if (nums[counter]==num) return counter;
//     }
//     throw new AmNotMadException("get small brain");
//    }
//
//    private static void swap(int[] arr){
//        int temp;
//        temp = arr[0];
//        temp= arr[1];
//
//    }
//
//
//    private static int getMax(int[] array) {
//        int max = array[0];
//        for (int num:array){
//            if (num<max) max=num;
//        }
//        return max;
//    }
//    }
//
//
