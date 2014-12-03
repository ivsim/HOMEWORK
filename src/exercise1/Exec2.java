package exercise1;

import java.util.Scanner;

public class Exec2 {

	/*
	 * Направете програма, която чете от конзолата 3 числа и извежда кое е
	 * най-голямото и кое е най-малкото число от трите
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please, enter 1st number: ");
		int firstNum = input.nextInt();
		
		System.out.println("Please, enter 2nd number: ");
		int secondNum = input.nextInt();
		
		System.out.println("Please, enter 3rd number: ");
		int thirdNum = input.nextInt();
		
		if (firstNum < secondNum && firstNum < thirdNum)
		{
			System.out.println("Smallest number is: " + firstNum);
		}
		
		if (secondNum < firstNum && secondNum < thirdNum)
		{
			System.out.println("Smallest number is: " + secondNum);
		}
		
		if (thirdNum < firstNum && thirdNum < secondNum)
		{
			System.out.println("Smallest number is: " + thirdNum);
		}

	}

}
