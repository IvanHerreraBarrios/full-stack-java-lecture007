package lecture007;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value");
		int value = keyboard.nextInt();
		int acumulator = 0;
		while(value != 0) {
			if(value > 10 && value < 30) {
				acumulator += value;
			}
			System.out.println("Enter value");
			value = keyboard.nextInt();
		}
		
		System.out.println("cumulative total" + acumulator);
		keyboard.close();
	}

}
