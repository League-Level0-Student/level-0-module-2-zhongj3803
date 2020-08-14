package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotterNumbers {
public static void main(String[] args) {
Random ran = new Random();
int number1 = ran.nextInt(50)+1;	
int number2 = ran.nextInt(50)+1;	
int number3 = ran.nextInt(50)+1;	
int number4 = ran.nextInt(50)+1;	
int number5 = ran.nextInt(50)+1;	
int number6 = ran.nextInt(50)+1;

JOptionPane.showMessageDialog(null, "Your lottery numbers are: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6);

	
	
}
}
