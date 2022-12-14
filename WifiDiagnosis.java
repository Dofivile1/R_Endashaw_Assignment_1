
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 09/12/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Robel Endashaw
*/


import java.util.Scanner;

public class WifiDiagnosis {
public static void main(String args[]) {
	// Declare constant variables
	final String QUESTION="Did that fix the problem? (Yes or No)";
	final String DONE="Done";
	final String INVALID="Invalid answer; try again";
	final String PROGRAMMER="Robel Endashaw";
	
	//Declare a string variable named response for the user input
	String response;
	
	Scanner input=new Scanner(System.in);
	
	// WifiDiagnosis application header
	System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.\n");
	System.out.println("Reboot the computer and try to connect");
	System.out.println(QUESTION);
	response=input.next();
	
	// Check if the response was (yes or no)
	if(response.toLowerCase().equals("yes") ) {
		System.out.println();
		System.out.println(DONE);
		System.out.println("Programmer: "+ PROGRAMMER);
	}else if(response.toLowerCase().equals("no") ) {
		System.out.println("Reboot the router and try to connect");
		System.out.println(QUESTION);
		response=input.next();
		
		if(response.toLowerCase().equals("yes") ) {
			System.out.println();
			System.out.println(DONE);
			System.out.println("Programmer: "+ PROGRAMMER);
		}else if(response.toLowerCase().equals("no") ) {
			System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
			System.out.println(QUESTION);
			response=input.next();
			
			if(response.toLowerCase().equals("yes") ) {
				System.out.println();
				System.out.println(DONE);
				System.out.println("Programmer: "+ PROGRAMMER);
			}else if(response.toLowerCase().equals("no") ) {
				System.out.println("Move the computer closer to the router and try to connect");
				System.out.println(QUESTION);
				response=input.next();
				
				if(response.toLowerCase().equals("yes") ) {
					System.out.println();
					System.out.println(DONE);
					System.out.println("Programmer: "+ PROGRAMMER);
				}else if(response.toLowerCase().equals("no") ) {
					System.out.println("Contact vour ISP");
					System.out.println();
					System.out.println(DONE);
					System.out.println("Programmer: "+ PROGRAMMER);
				}else {
					System.out.println();
					System.out.println(INVALID);
				}
			}else {
				System.out.println();
				System.out.println(INVALID);
				System.out.println("Programmer: "+ PROGRAMMER);
			}
		
		}else {
			System.out.println();
			System.out.println(INVALID);
			System.out.println("Programmer: "+ PROGRAMMER);
			}

	}else {
		System.out.println();
		System.out.println(INVALID);
		System.out.println("Programmer: "+ PROGRAMMER);
}
}
}

