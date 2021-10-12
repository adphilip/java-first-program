package com.h2;

//import jdk.internal.util.xml.impl.ReaderUTF16;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }


    //For the implementation of add() method, replace return -1;
    // from the last task with the following. 
    //Create a variable called sum, and initialize its value to 0. 
    //Then, using a for loop over numbers (or using a while loop), 
    //add every item in the numbers array to the sum variable. Finally, return sum.


    private static int add(int [] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
