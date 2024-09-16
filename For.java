package lecture007;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long even = 0;
		long odd = 0;
		
		System.out.println("Enter n");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		for(int i=0; i < n || even < 50; i++) {
			if(i%2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		
		System.out.println("Even" + even);
		System.err.println("Odd" + odd);
		
		keyboard.close();
		
	}

}
