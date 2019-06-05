/**
 * Md Rahman
 * Create a multi-demensional multiplication table using arrays
 */

public class Week1Daily2_MultTables {

    public static void main(String[] args) {
        printTables();
    } // end main

    // create a multidimensional array that prints a multiplication table
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
} // end class
