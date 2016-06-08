/**
 * 
 */
package sdh.java.session2;

import java.util.Scanner;

/**
 * @author sudhi
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("Enter your age: ");
		try {
		int age = Integer.parseInt(in.nextLine());
		if(age >= 18)
			System.out.println("You are eligible to vote.");
		else if(age<18 && age>0)
			System.out.println("You are not eligible to vote.");
		
		else
			System.out.println("Invalid Input");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Input.");
		}
	}

}
