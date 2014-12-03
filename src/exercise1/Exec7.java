package exercise1;

import java.util.Scanner;

public class Exec7 {

	/*
	 * Създайте програма, която изчислява бонус точки на база резултат от игра.
	 * Потребителят трябва да въведе своите точни в интервалa[1,;9].
	 * Ако точките са в интервала [1;3] Умножете ги по 5.
	 * Ако точките са в интервала [4;6] Умножете ги по 10.
	 * Ако точките са в интервала [7;9] Умножете ги по 50.
	 * Резултатът изведете на екрана
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please, enter your game result (requires an integer - [1;9]): ");
		int pointsNumber = input.nextInt();
		input.nextLine();
				
		switch (pointsNumber){
				
		case 1:case 2:case 3:
			pointsNumber = pointsNumber * 5;
			System.out.println("Congratulations! You've earned " + pointsNumber + " bonus points.");
			break;
		
		case 4:case 5:case 6:
			pointsNumber = pointsNumber * 10;
			System.out.println("Congratulations! You've earned " + pointsNumber + " bonus points.");
			break;
		
		case 7:case 8:case 9:
			pointsNumber = pointsNumber * 50;
			System.out.println("Congratulations! You've earned " + pointsNumber + " bonus points.");
			break;
		
		default:
			System.out.println("Entered points out of range !!!...");
			break;
		}
				
		
	}

}
