//****************************************************************************************//
//* Author: 1625601                    							        				 *//
//* Week:                               						        				 *//
//* Element:    Assignment 1                 						    				 *//
//* Description:  													    				 *//
//*        This class starts by assigning a pass int and a fail int both at 0.			 *//
//*		   it then welcomes the user to the grading system and informs the user to		 *//
//*  	   either enter a 1 for a pass or a 2 for a fail from a message dialog. the code *//
//*  	   then starts a for loop where x has a value of 1 and counts up in increments	 *//
//*        of 1 per input until x reaches a value of 20. the system displays an input 	 *//
//*		   dialog of the current entry number and asks the user to enter a 1 or a 2		 *//
//*        if 1 is entered the systems adds a 1 to the pass variable and if 2 is 		 *//
//*        entered the system adds a 1 to the fail variable. the system then displays    *//
//*		   a message dialog of the total passes and total fails. if the pass total 	     *//
//*        is equal to or greater than 16 the system also displays "Congratulations to 	 *//
//*        the Tutors!" in the message dialog. is the pass value is less than 15 the 	 *//
//*        system displays "either the tutors or the students messed up here !"			 *//
//*        in the message dialog.														 *//
//*                                        						        				 *//
//* Date: 08/08/19                        						        				 *//
//*                                         						    				 *//
//****************************************************************************************//

package logbooks;
import javax.swing.JOptionPane; //import javax swing joptionpane

public class task3b { //start class

	public static void main(String args[]) { //start main

		int pass = 0; //set pass int to 0
		int fail = 0; //set fail int to 0

		JOptionPane.showMessageDialog(null, "welcome to the total grade system"); //intro
		JOptionPane.showMessageDialog(null, "enter either the number 1 for pass or 2 for fail"); //intro
		
		for (int x = 1; x <= 20; x++) { //for loop 20 times
			
			int value =  Integer.parseInt(JOptionPane.showInputDialog("Entry number " + x + ": Enter Here!"));  //assign entry to a variable

				if (value == 1) { //if number 1 is entered 
					pass++; //increase pass int by 1
	
				} else if (value == 2) { //if number 2 is entered
					fail++; //increase fail int by 1
	
				} //end if statement

		} //end for loop
		
			if (pass == 16 || pass > 16) { //if pass is equal to or greater than 16
				JOptionPane.showMessageDialog(null,
						"total pass: " + pass + "   total fail: " + fail +//display total pass and total fail entries
						"\n Congratulations to the Tutors!"); //display success text
			} else { //if pass is below 16
				JOptionPane.showMessageDialog(null,
						"total pass: " + pass + "   total fail: " + fail +//display total pass and total fail entries
						"\n either the tutors or the students messed up here !"); //display fail text
			} //end if statement
		
	} //end main

} //end class
