package exercise1;

import java.util.Scanner;

public class Exec4 {

	/*
	 * Направете програма, която приема 3 цели числа. Изведете на конзолата дали може да
	 * бъде бъде образуван триъгълник с дължини на страните съответни 3 числа.
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please, enter: a = ");
		int a = input.nextInt();
		
		System.out.print("Please, enter: b = ");
		int b = input.nextInt();
		
		System.out.print("Please, enter: c = ");
		int c = input.nextInt();
		
		if (a + b > c && a + c > b && b + c > a)
		{
			System.out.print("a, b and c ---> triangle...");
		}
		else
			System.out.print("a, b and c ---> NO");
	}

}
