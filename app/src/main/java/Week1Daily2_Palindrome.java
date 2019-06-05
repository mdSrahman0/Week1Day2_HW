/**
 * Md Rahman
 * Without using a .reverse method, check if a word is a palindrome
 */

import java.util.Arrays;

public class Week1Daily2_Palindrome {

    public static void main(String[] args) {

        // array to hold multiple test strings
        String[] a = {"deed", "racecar", "jack", "DooRRooD"};
        boolean boo;

        // iterate thru each string, calling the checkPalindrome method each time
        for (String s: a) {
            boo = checkPalindrome(s);
            System.out.println("Is the string '" + s + "' a palindrome?");
            System.out.println(boo);
        }
    }

    // receives a single string and returns true if it is a palindrome
    public static boolean checkPalindrome(String s) {
        boolean p = false; // create initial boolean initialized to false
        char[] myArray = s.toCharArray(); // convert the string into a character array

        // a new char array that will eventually hold the chars from myArray in reverse order
        char[] reverseArray = new char[myArray.length];

        int j = myArray.length-1;

        // We will start with the last index of myArray and add that char into into the first index
        // of reverseArray. myArray will be decremented while reverseArray will be incremented.
        for (int i = 0; i < myArray.length; i++){
            reverseArray[i] = myArray[j];
            j--;
        } // end for

        // compare each element of each array. return true if equal
        if(Arrays.equals(myArray,reverseArray)) {
            return true;
        }
        return false;
    } // end checkPalindrome()
} // end class
