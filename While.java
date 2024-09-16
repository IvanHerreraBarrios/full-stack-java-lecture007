package lecture007;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter value");
		int value = keyboard.nextInt();
		
		//control cut
		while (value < 10) {
			System.out.println("Enter value");
			value = keyboard.nextInt();
		}
	}
}
