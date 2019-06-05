/**
 * Md Rahman. Week1Day2.
 * Given a list of strings, print out all duplicates. Strings are also case sensitive
 */

package com.example.week1day2_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(); // will contain list of strings

        String[] strs = {"Hello", "Goodbye", "Mirror", "Hello", "Artificial", "Hello", "drugs",
                "ap", "drugs", "drugs"};

        // idea taken from StackOverflow. Same as having a for loop that takes every string from
        // strs, and adds to strList
        strList.addAll(Arrays.asList(strs));

        findDuplicates(strList);
    } // end main

    public static void findDuplicates(List<String> listOfStrings) {

        // this newList will contain all duplicate strings
        List<String> newList = new ArrayList<>();

        // nested for loop will iterate thru every element
        for (int i = 0; i < listOfStrings.size(); i++) {
            for (int j = i+1; j < listOfStrings.size(); j++) {
                String a = listOfStrings.get(i); // store string in index i in String a
                String b = listOfStrings.get(j); // store string in index j in String b

                // if a and b are equivalent and our newList doesn't already contain it,
                // add it to the newList
                if (a.equals(b) && !newList.contains(a)) {
                    newList.add(a);
                }
            } // end inner for
        } // end outer for

        // print out all elements from newList
        System.out.println("Here are all the strings that have duplicates:");
        for (String s: newList) {
            System.out.println(s);
        }

    } // end findDuplicates()

} // end class
