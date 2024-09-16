package lecture007;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the option");
		
		System.out.println("Enter option");
		System.out.println("1 Discharge");
		System.out.println("2 Unsuscribe");
		System.out.println("3 Modify");
		System.out.println("4 Delete");
		
		Scanner keyboard = new Scanner(System.in);
		Integer option = keyboard.nextInt();		
		switch (option) {
		case 1: {
			System.out.println("Enter value");
			Double value = keyboard.nextDouble();
			System.out.println("Price entered is " + value);
			break;
		}
		case 2: {
			System.out.println("Enter the code to delete");
			Long code = keyboard.nextLong();
			System.out.println(code + "has been removed");
			break;
		}
		default:
		}
		
		keyboard.close();
	}

}
