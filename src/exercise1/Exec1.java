package exercise1;

import java.util.Scanner;

public class Exec1 {

/*
 * Направете програма, която чете от конзолата 1 string и 2 целочислени числа.
 * 
 * Проверете и изкарайте на конзолата
 * Дали размера на string е по-голям от 10
 * Дали първото число е по-голямо от второто
 * Дали второто число е в интервала [-100; 15)
 * Остатъкът от деленето на първото число с второто
 * Резултатът от логическата операция – Дали първото число е по-голямо от 10 или второто число е по-малко от 88	
 */
	
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please, enter one word: ");
		
		String inputText = input.nextLine();
		
		System.out.println("Please, enter 2 integers. Make sure, they are different!");
		
		System.out.println("Please, enter 1st integer: ");		
		int inputNumber1 = input.nextInt();
		
		System.out.println("Please, enter 2nd integer: ");
		int inputNumber2 = input.nextInt();		
		
		int letterNumber = inputText.length();
		
		// aim is to avoid use of conditionals...
		
		boolean check1 = (letterNumber == 10);		
		System.out.println("Word letter number is 10 ???: " + check1);
		
		boolean check2 = (inputNumber1 > inputNumber2);		
		System.out.println("1st integer is greater than 2nd integer ???: " + check2);
		
		boolean intervalCheck = ((inputNumber2 >= -100) && (inputNumber2 < 5));
		System.out.println("2nd integer is within [-100;5)... ???: " + intervalCheck);
				
		int remainderNum1Num2 = (inputNumber1 % inputNumber2);
		System.out.println("Remainder of 1st integer divided by 2nd integer is: " + remainderNum1Num2);
		
		boolean result = ((inputNumber1 > 10) || (inputNumber2 < 88));
		System.out.println("Whether 1st integer is greater than 10 OR 2nd integer is smaller than 88 is... " + result);
		
		 
	}
	
	}