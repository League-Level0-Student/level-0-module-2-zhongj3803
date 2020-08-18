//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {

		// 2. Get the user to enter a question for the 8 ball to answer
		JOptionPane.showInputDialog("Enter a question that is bugging you right now. ONLY YES NO QUESTIONS (:");

		// 3. Make a variable and initialize it to a random number.
		// ** You will need to make a random object!
		// Limit the random numbers to be between 0 and 3
		Random ran = new Random();
		int number = ran.nextInt(4);
		// 4. If the random number is 0

		switch (number) {
		case 0:
			JOptionPane.showMessageDialog(null, "yes");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "no");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Haha I have no clue.");
			break;
		default:

		}
	}
}
