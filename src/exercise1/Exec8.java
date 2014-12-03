package exercise1;

import java.util.Scanner;

public class Exec8 {

	/*
	 * Класическото тесте карти се състои от 13 различни вида карти съответно
	 * 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.
	 * Направете програма която приема от конзолата 1 символ и принтира "Валидна карта"
	 * ако символът представлява валидна карта и съответно "Невалидна карта"
	 * ако символът не представлява валидна карта 
	 */
			
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please, enter card: ");
		String card = input.nextLine();
		int symbolNum = 0;
		
		//в JDK 6 switch блокът не работи със string-ове, но работи с char. Char, обаче не е податлива на .next()... :(
		// с оператора '==' не може да се сравняват стрингове, те се сравняват с метода .equals().
		
		if (card.equals("2")){symbolNum = 2;}if (card.equals("3")){symbolNum = 3;}if (card.equals("4")){symbolNum = 4;}
		if (card.equals("5")){symbolNum = 5;}if (card.equals("6")){symbolNum = 6;}if (card.equals("7")){symbolNum = 7;}
		if (card.equals("8")){symbolNum = 8;}if (card.equals("9")){symbolNum = 9;}if (card.equals("10")){symbolNum = 10;}
		if (card.equals("J") || card.equals("j")){symbolNum = 11;}
		if (card.equals("Q") || card.equals("q")){symbolNum = 12;}
		if (card.equals("K") || card.equals("k")){symbolNum = 13;}
		if (card.equals("A") || card.equals("a")){symbolNum = 14;}
		
		switch (symbolNum){
		
		case 2: case 3: case 4: case 5: case 6: case 7:
		case 8: case 9: case 10: case 11: case 12: case 13:
		case 14:
			System.out.println("Валидна карта");
			break;
			
			default:
				System.out.println("Невалидна карта");
				break;		
		}
		
				
		
	}

}
