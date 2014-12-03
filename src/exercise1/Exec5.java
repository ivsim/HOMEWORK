package exercise1;

import java.util.Scanner;

public class Exec5 {

	/*
	 * Компания се нуждае от система за съхранение на информация за служители.
	 * Направете програма, която изисква следната информация:
	 * Име, Фамилия, Години (0, 120), пол (еднобуквен 'м' или 'ж'), ЕГН, телефон.
	 * Подберете подходящите типове данни и декларирайте нужните променливи.
	 * Прочетете от конзолата нужната иформация за служител и след това я изведете на конзолата	
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Моля, въведете следната информация");
		
		String divider = "----------------------------------";
		System.out.println(divider);
		
		System.out.print("Име Фамилия: ");
		String name = input.nextLine();
		
		System.out.print("Възраст, години - (0-120): ");
		int age = input.nextInt();
		input.nextLine(); // consumes the last enter symbol nextInt does not consume ---> long live Stackoverflow...!
		boolean ageControl = (age <= 0 || age > 120);
				
		System.out.print("Пол, (м или ж): ");
		String gender = input.nextLine();
		
		System.out.print("ЕГН: ");
		String egn = input.nextLine();
		 
		System.out.print("Телефонен номер: ");
		String phoneNum = input.nextLine();
		
		
		System.out.printf("%n", divider);
		System.out.println("Вие въведохте:");
		System.out.println(divider);
		System.out.printf("%-13s %-1s %n", "име:", name);
		System.out.println(divider);
		
		if (ageControl == true)
		{
			age = 0;
			System.out.printf("%-13s %-1s %n", "възраст: ", "грешка");
		}
		else
		{
			System.out.printf("%-13s %-1s %n", "възраст: ", age);
		}
		
		System.out.println(divider);
		System.out.printf("%-13s %-1s %n", "пол:", gender);
		System.out.println(divider);
		System.out.printf("%-13s %-1s %n", "ЕГН:", egn);
		System.out.println(divider);
		System.out.printf("%-13s %-1s %n", "тел:", phoneNum);	
		
		
		
	}

}
