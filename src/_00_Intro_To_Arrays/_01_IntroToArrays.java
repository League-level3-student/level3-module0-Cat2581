package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] videogames = new String[5];
    	
    	videogames[0] = "OverWatch";
    	videogames[1] = "Rainbow Six Seige";
    	videogames[2] = "Cold War";
    	videogames[3] = "Neir Automata";
    	videogames[4] = "Apex";
        // 2. print the third element in the array
    	System.out.println(videogames[3]);
        // 3. set the third element to a different value
    	videogames[3] = "Day Z";
        // 4. print the third element again
    	System.out.println(videogames[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
    	Random random = new Random();
    	int[] intArray = new int[50];
        for (int i = 0; i < intArray.length; i++) {
           intArray[i] = random.nextInt(); 
           System.out.println(intArray[i]);
        }
        System.out.println("/////////////////");
        int minnumber = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
			if (minnumber >  intArray[i]) {
				minnumber = intArray[i];
			}
		}
        System.out.println(minnumber);
        System.out.println("//////////////////");
        
        int maxnumber = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
			if (maxnumber <  intArray[i]) {
				maxnumber = intArray[i];
			}
		}
       System.out.println(maxnumber);
       System.out.println("//////////////////");
  
       System.out.println(intArray[intArray.length -1]);
    
    }

    }
        // 8. use a for loop to make every value of the integer array a random number
    	
        // 9. without printing the entire array, print only the smallest number on the array
    	
        // 10 print the entire array to see if step 8 was correct
    	 
        // 11. print the largest number in the array.
    	 
        // 12. print only the last element in the array


















