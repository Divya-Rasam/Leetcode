package Writing_Items_into_Arr_with_Loop;

import Creating_an_Array.DVD;

public class ArrayLoop {
    public static void main(String[] args) {
        
    int[] squareNumbers = new int[10];

    // Go through each of the Array indexes, from 0 to 9.
    for (int i = 0; i < 10; i++) {
        // We need to be careful with the 0-indexing. The next square number is given by (i + 1) * (i + 1).
        // Calculate it and insert it into the Array at index i.
        int square = (i + 1) * (i + 1);
        squareNumbers[i] = square;
    }


        //Reading Items from an Array with a Loop

    // Go through each of the Array indexes, from 0 to 9.
    for (int i = 0; i < 10; i++) {
        // Access and print what's at the i'th index.
        System.out.println(squareNumbers[i]);
    }


    // "for each" loop.
    System.out.println();

    // For each VALUE in the Array.
    for (int square : squareNumbers) {
        // Print the current value of square.
        System.out.println(square);
    }
    // Prints exactly the same as the previous example.






    
    DVD [] array = new DVD[6];
int capacity = array.length;
System.out.println("The Array has a capacity of " + capacity);



    }
}




// DVD [] array = new DVD[6];

// int capacity = array.length;
// System.out.println("The Array has a capacity of " + capacity);

// The Array has a capacity of 6
