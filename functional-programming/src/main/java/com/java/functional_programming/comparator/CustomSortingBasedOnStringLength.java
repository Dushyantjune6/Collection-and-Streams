package com.java.functional_programming.comparator;

import java.util.*;

public class CustomSortingBasedOnStringLength {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pine Apple");
        list.add("Date");
        list.sort(new MyComparator());
        System.out.println(list);
    }
}



class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

