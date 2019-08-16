//***********************************************************************//
//* Author: 1625601                    							        *//
//* Week:                               						        *//
//* Element:    Assignment 1                 						    *//
//* Description:  Animal Class										    *//
//*                                        						        *//
//* Date: 08/08/19                        						        *//
//*                                         						    *//
//***********************************************************************//

package task4d;

public abstract class Animal { //abstract class
    public boolean isPet = true;
    public String owner = "John";
    
    public void sleep() { 
        System.out.println("Sleeping"); //print line sleeping
    }
    
    public void eat() { 
        System.out.println("Eating"); //print line eating
    }
    
    public abstract void move(); //call method move()
}
