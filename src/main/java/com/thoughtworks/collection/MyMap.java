package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(num -> num * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(num -> letters[num - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(num -> getLetters(num - 1)).collect(Collectors.toList());
    }

    private String getLetters(Integer num) {
        if (num < 0) {
            return "";
        } else if (num < 26) {
            return letters[num];
        } else {
            return getLetters(num / 26 - 1) + getLetters(num % 26);
        }
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
