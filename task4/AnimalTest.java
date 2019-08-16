//***********************************************************************//
//* Author: 1625601                    							        *//
//* Week:                               						        *//
//* Element:    Assignment 1                 						    *//
//* Description:  AnimalTest class / Main							    *//
//*                                        						        *//
//* Date: 08/08/19                        						        *//
//*                                         						    *//
//***********************************************************************//


package task4;

public class AnimalTest { //super-class start
    public static void main(String[] args) { //start main
        Cat felix = new Cat(); //set subclass cat
        Dog pluto = new Dog(); //set subclass dog
        Lion alex = new Lion(); //set subclass lion
        
        System.out.println("--> Felix the cat:"); //print line text
        felix.meow(); //call method meow
        felix.eat(); //call method eat
        felix.sleep(); //call method sleep
        
        System.out.println("\n--> Pluto the dog:"); //print line text
        pluto.bark(); //call method bark
        pluto.eat(); //call method eat
        pluto.sleep(); //call method sleep
        
        System.out.println("\n--> Alex the lion:"); //print line text
        alex.roar(); //call method roar
        alex.eat(); //call method eat
        alex.sleep(); //call method sleep
    }
}
