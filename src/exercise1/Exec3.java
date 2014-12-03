package exercise1;

import java.util.Scanner;

public class Exec3 {

	/*
	 * Направете програма, която приема две числа с плаваща запетая съответно дължината
	 * и ширината на правоъгълник. Пресметнете лицето на дадния правоъгълник и я
	 * изведете на конзолата
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please, enter rectangle's leangth (requires float value): ");
		float recLen = input.nextFloat();
		
		System.out.println("Please, enter rectangle's width (requires float value): ");
		float recWid = input.nextFloat();
		
		float recArea = recLen * recWid;
		
		System.out.println("Rectangle's area is : " + recArea);

	}

}
