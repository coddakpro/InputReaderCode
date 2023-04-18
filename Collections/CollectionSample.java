package com.example.Collections;

import java.util.*;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

public class CollectionSample {
    public static void main(String[] args) {
        Queue<Integer> collection = new LinkedList<>();
        collection.add(11);
        collection.add(12);
        collection.add(13);
        collection.add(14);
        collection.add(15);
        List<Integer> nums = new ArrayList<>(30);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.remove((Integer) 10);
//
//        nums.add(1, 100);
//
//        nums.addAll(collection);
//
//        System.out.println(nums);
//

    }
}
