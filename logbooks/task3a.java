//***************************************************************************************//
//* Author: 1625601                    							        				*//
//* Week:                               						        				*//
//* Element:    Assignment 1                 						    				*//
//* Description:  													    				*//
//*        This class starts by assigning a pass int and a fail int both at 0.			*//
//*		   it then welcomes the user to the grading system and informs the user to		*//
//*  	   either enter a 1 for a pass or a 2 for a fail into the console. the code		*//
//*  	   then starts a for loop where x has a value of 1 and counts up in increments	*//
//*        of 1 per input until x reaches a value of 20. the system prints into the 	*//
//*        console the current entry number and asks the user to enter a 1 or a 2		*//
//*        if 1 is entered the systems adds a 1 to the pass variable and if 2 is 		*//
//*        entered the system adds a 1 to the fail variable. the system then prints 	*//
//*        out the total passes and total fails into the console. if the pass total 	*//
//*        is equal to or greater than 16 the system prints out "Congratulations to 	*//
//*        the Tutors!" into the console. is the pass value is less than 15 the 		*//
//*        system prints out "either the tutors or the students messed up here !"		*//
//*        into the console.															*//
//*                                        						        				*//
//* Date: 08/08/19                        						        				*//
//*                                         						    				*//
//***************************************************************************************//


package logbooks;

import java.util.Scanner; //import java util scanner

public class task3a { //start class

	public static void main(String args[]) { //start main

		int pass = 0; //set pass int to 0
		int fail = 0; //set fail int to 0

		System.out.println("welcome to the total grade system"); //intro text
		System.out.println("enter either the number 1 for pass or 2 for fail"); //intro text

		for (int x = 1; x <= 20; x++) { //for loop 20 times

			System.out.println("Entry number " + x + ": Enter here!"); //enter number and displays which entry your entering
			Scanner entry1 = new Scanner(System.in); //scanner
			int value = entry1.nextInt(); //assign entry to a variable

				if (value == 1) { //if number 1 is entered 
					pass++; //increase pass int by 1
	
				} else if (value == 2) { //if number 2 is entered
					fail++; //increase fail int by 1
	
				} //end if statement

		} //end for loop

		System.out.println("total pass: " + pass + "   total fail: " + fail); //display total pass and total fail entries
		
			if (pass == 16 || pass > 16) { //if pass is equal to or greater than 16
				System.out.println("Congratulations to the Tutors!"); //display success text
			} else { //if pass is below 16
				System.out.println("either the tutors or the students messed up here !"); //display fail text
			} //end if statement
		
	} //end main

} //end class
