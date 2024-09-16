package lecture007;

import java.util.Scanner;

public class Integrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an option");
		
		Scanner keyboard = new Scanner(System.in);
		
		Integer continu;
		long acumulate = 0;
		int count = 0;
		do {
			System.out.println("Enter option");
			System.out.println("1 Accumulate: ");
			System.out.println("2 Count");
			
			System.out.println("Enter value");
			int option = keyboard.nextInt();
			
			switch (option) {
			case 1: {
				System.out.println("Enter value");
				long valueAcumulate = keyboard.nextLong();
				acumulate += valueAcumulate;
				break;
				
			}
			case 2: {
				System.out.println("Enter value");
				long valueCount = keyboard.nextLong();
				count += valueCount;
				break;
			}
			default:
				break;
			}
			
			System.out.println("Do you want to continue? 1Y 2N");
			continu = keyboard.nextInt();
		}while(continu != 0);
		System.out.println("Acumulate" + acumulate);
		System.out.println("Count" + count);
		
		keyboard.close();
	}

}
