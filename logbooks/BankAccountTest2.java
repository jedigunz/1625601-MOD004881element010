//***********************************************************************//
//* Author: 1625601                    							        *//
//* Week:                               						        *//
//* Element:    Assignment 1                 						    *//
//* Description:  Bank Account 2									    *//
//*        																*//
//*                                        						        *//
//* Date: 08/08/19                        						        *//
//*                                         						    *//
//***********************************************************************//


package logbooks;
import javax.swing.JOptionPane;
public class BankAccountTest2 { //start BankAccountTest class

	public static void main(String[] args) { //main 

		int g = -1; //while loop counter

		while (g < 0) { //start while loop

			String name = JOptionPane.showInputDialog("Enter Name"); //dialog box enter name

			if (name.length() > 0) { //if length of name bigger than Zero
				
				double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance")); //dialog box enter balance

					if (balance > 0) { //if balance larger than Zero
						
						g++; //stop while loop by increasing loop counter
						JOptionPane.showMessageDialog(null,"Account Name: " + name + "\nAccount Balance: " + balance); //display name and balance
						
						
					} else { //if balance less than Zero
						
						JOptionPane.showMessageDialog(null, "Error: Balance Too Low"); //display error message for the balance input too low
		
					}
					
			} else { //if length of name less than Zero
				
				JOptionPane.showMessageDialog(null, "Error: Nothing Entered, Re-Enter name"); //display error message for no name input
			}
			
		}//end while loop
	}
} //end BankAccountTest