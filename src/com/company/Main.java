package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);

       Integer max = integerList.stream()
               .filter(x -> x % 2 == 0)
               .map(x -> x * x)
               .max(Integer::compare)
               .get();
        System.out.println("Maximum number of square: " + max);
    }
}
