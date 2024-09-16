package lecture007;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of notes");
		Scanner keyboard = new Scanner(System.in);
		
		int numberNotes = keyboard.nextInt();
		int largest = 0;
		int smallest = 0;
		float average;
		int total = 0;
		for(int i = 0; i < numberNotes; i++) {
			System.out.println("Enter the note" + (i+1));
			int note = keyboard.nextInt();
			total += note;
			if(note > largest) {
				largest = note;
			}
			if(note < smallest) {
				smallest = note;
			}
		}
		
		average = (float) total / numberNotes;
		System.out.println("Notes " + numberNotes);
		System.out.println("largest " + largest);
		System.out.println("smallest " + smallest);
		System.out.println("average " + average);
		keyboard.close();
	}

}
