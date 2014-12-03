package exercise1;

public class Exec6 {

	/*
	 * Дефинирайте две int променливи със стойности съответно 1 и 3.
	 * Опитайте се да размените техните стойности.
	 */
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
