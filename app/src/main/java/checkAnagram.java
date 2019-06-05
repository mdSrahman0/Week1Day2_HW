/**
 * Md Rahman
 * Checks to see if two words are anagrams
 */

import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {

        String a = "";
        String b = "";
        Boolean boo = false;

        // REMEMBER - CASE SENSITIVE!!
        boo = checkAnagrams(a, b);
        System.out.println("Is " + a + " and " + b +" an anagram: " + boo);

        a = "Clib Brass";
        b = "Brib Cliss"; //missing an a and has extra i
        boo = checkAnagrams(a, b);
        System.out.println("Is " + a + " and " + b +" an anagram: " + boo);

        a = "Clib  Brass";
        b = "Clib Brasss"; // has extra s
        boo = checkAnagrams(a, b);
        System.out.println("Is " + a + " and " + b +" an anagram: " + boo);

        a = "TACO";
        b = "COAT";
        boo = checkAnagrams(a, b);
        System.out.println("Is " + a + " and " + b +" an anagram: " + boo);

        a = "FARCRY NOW";
        b = "CARFRY OWN";
        boo = checkAnagrams(a, b);
        System.out.println("Is " + a + " and " + b +" an anagram: " + boo);
    }

    // pass in two strings and returns TRUE if both strings are an anagram
    public static boolean checkAnagrams(String c, String d){

        // first check if both strings are empty. if yes, return true
        if(c.length() == 0 && d.length() == 0){
            return true;
        }
        // check if both strings are same length. if no, return false
        if(c.length() != d.length()){
            return false;
        }

        int i = 0; // counter for first string
        int j = 0; // counter for second string

        while(i < c.length()) { // Do following only if c has more characters
            while(j < d.length()) { // Do following only if d has more characters

                if(c.charAt(i) == d.charAt(j)) {
                    // create new substrings after replacing identical character
                    c = c.substring(0,i) + c.substring(i+1);
                    d = d.substring(0,j) + d.substring(j+1);

                    // all characters have been matched, return true;
                    if(c.isEmpty() && d.isEmpty()) {
                        return true;
                    }
                    i = 0;
                    j = 0;
                }
                else{
                    // increment j and run inner while again
                    j++;
                }
            } // end inner while
            i++;
        } // end outer while
        return false;
    }
}
