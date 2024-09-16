package lecture007;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// if/else while for do, while
		
		
		
		int age = 10;
		int age2 = 20;
		
		if(true)
			System.out.println("Hi");
		
		if(age > age2)
			System.out.println("Hi");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter age");
		Integer $age = keyboard.nextInt();// wrapper
		boolean isItNumerical = $age instanceof Integer;
		if($age > 18) {
			System.out.println("You're of legal age");
			//20 30 ?
			if($age > 20 && $age < 30) {
				System.out.println("It is between 20 and 30");
			} else {
				System.out.println("Another");
			}
		}else if($age == 15){
			System.out.println("It is 15");
		}else {			
			System.out.println("You're a minor");
		}
		
		System.out.println("Enter a name:");
		String name = keyboard.next();
		
		if(name.contains("X")) {
			System.out.println(name + "contains X");
		} else {
			System.out.println(name + "dosnt contain X");
		}
		
		boolean containX = name.contains("x") ? true : false;
		keyboard.close();
	}

}
