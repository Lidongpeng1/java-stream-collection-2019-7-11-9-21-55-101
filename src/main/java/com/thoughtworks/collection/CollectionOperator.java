package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        boolean asc = left <= right;
        int low = left <= right ? left : right;
        int high = left > right ? left : right;
        List<Integer> list = IntStream.rangeClosed(low, high).boxed().collect(Collectors.toList());
        if (!asc) {
            Collections.reverse(list);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        boolean asc = left <= right;
        int low = left <= right ? left : right;
        int high = left > right ? left : right;
        List<Integer> list = IntStream.rangeClosed(low, high).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());
        if (!asc) {
            Collections.reverse(list);
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
