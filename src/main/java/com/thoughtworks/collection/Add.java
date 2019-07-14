package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
            int low = leftBorder < rightBorder ? leftBorder : rightBorder;
            int high = leftBorder > rightBorder ? leftBorder : rightBorder;
            int sum = IntStream.rangeClosed(low, high).filter(temp -> temp % 2 == 0).sum();
            return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int low = leftBorder < rightBorder ? leftBorder : rightBorder;
        int high = leftBorder > rightBorder ? leftBorder : rightBorder;
        int sum = IntStream.rangeClosed(low, high).filter(num -> num % 2 == 1).sum();
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = arrayList.stream().mapToInt(temp -> temp * 3 + 2).sum();
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
