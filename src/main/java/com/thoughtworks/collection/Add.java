package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
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
        List<Integer> list = arrayList.stream().mapToInt(temp -> temp = temp % 2 != 0 ? temp * 3 + 2 : temp).boxed().collect(Collectors.toList());
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = arrayList.stream().filter(num -> num % 2 == 1).reduce( 0, (totalValue, value) -> {
            if (value % 2 == 1) {
                totalValue += value * 3 + 5;
                return totalValue;
            }
            return totalValue;
        });
        return sum;
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
        double median;
        if (sortedList.size() % 2 == 0) {
            median = (sortedList.get(sortedList.size() / 2 - 1) + sortedList.get(sortedList.size() / 2)) / 2;
        } else {
            median = sortedList.get(sortedList.size() / 2);
        }
        return median;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(num -> num % 2 == 0).anyMatch( num -> num == specialElment);
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
