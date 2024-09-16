package lecture007;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//40:35
		int value1;
		int value2;
		Integer value3;
		
		System.out.println("Enter value1, value2, value 3");
		Scanner keyboard = new Scanner(System.in);
		
		value1 = keyboard.nextInt();
		value2 = keyboard.nextInt();
		value3 = keyboard.nextInt();
		
		if(value1 > value2 && value1 > value3) {
			System.out.println(value1);
		} else if(value2 > value1 && value2 > value3) {
			System.out.println(value2);
		} else if(value3 > value1 && value3 > value2) {
			System.out.println(value3);
		} else {
			System.out.println("Equals");
		}
		
		
		
		keyboard.close();
		
		
	}

}
