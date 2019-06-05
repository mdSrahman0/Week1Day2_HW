# Week1Day2_HW
Contains the homework given on the first day of training for Android Development.
NOTE: the Duplicates class is located in com.example.week1day2_hw. Everything else is under java

1) Given a list of strings, print out all duplicates.

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

![Week1Day2_findDuplicates()](https://user-images.githubusercontent.com/51377429/58966699-c14b1e00-8780-11e9-9a2b-cfdc7b36b0eb.png)


2) Without using a reverse() method, see if a word is a palindrome
        
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

![Week1Day2_Palindrome](https://user-images.githubusercontent.com/51377429/58966716-c90ac280-8780-11e9-851f-ac7c4024290f.png)


3) Given a number, print fizz if it's divisible by 3, buzz if divisible by 5, and fizzbuzz if divisible by both

        public static void isDivisible(double d){

                // we still store as double because we want to retain any decimal numbers for when we
                // compare it's int equivalent.
                double divThree = d/3; // hold the number/3
                double divFive = d/5;  // hold the number/5

                // first we check if the value of divThree and divFive are equivalent to their integer.
                // If they are, we're done.
                if(divThree == (int)divThree && divFive == (int)divFive) {
                    System.out.println("fizzbuzz");
                    return;
                }

                // check if divThree is equivalent to it's integer
                if(divThree == (int)divThree){
                    System.out.println("fizz");
                }

                // check if divFive is equivalent to it's integer
                if(divFive == (int)divFive){
                    System.out.println("buzz");
                }
        } // end isDivisible

![Week1Day2_Divisible](https://user-images.githubusercontent.com/51377429/58966727-d32cc100-8780-11e9-8836-30f117a33e37.png)


4) Given two strings, check if they are anagrams

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

![Week1Daily2_Anagrams](https://user-images.githubusercontent.com/51377429/58966738-d922a200-8780-11e9-94ab-404245bd8f15.png)


5) Using multi-dimensional arrays, print out a multiplication table 

        public static void printTables(){
                int[] initial = new int[10];      // initial array to hold values 1 ~ 10
                int[][] result = new int[10][10]; // result array to hold multiplication values

                // first we must populate our initial array with the numbers 1 ~ 10
                for(int i = 0; i < 10; i++){
                    initial[i] = i + 1; // do plus 1 or else we store 0 as first element
                }

                // populate result array by multiplying each element of initial array by each other
                for (int j = 0; j < 10; j++) {
                    for(int k = 0; k < 10; k++) {
                        result[j][k] = initial[j] * initial[k];
                    }
                }

                // print out result array
                for (int m = 0; m < 10; m++) {
                    for (int n = 0; n < 10; n++) {
                        System.out.print(result[n][m] + " ");
                    }
                    System.out.println();
                }
         } // end printTables

![Week1Daily2_MultTables](https://user-images.githubusercontent.com/51377429/58966763-e2137380-8780-11e9-851c-5b2714569659.png)
