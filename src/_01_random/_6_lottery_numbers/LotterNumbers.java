package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotterNumbers {
public static void main(String[] args) {
Random ran = new Random();
String lottery = "";
for (int i=0; i<6; i++) {
	lottery+=(ran.nextInt(50)+1)+" ";
}

JOptionPane.showMessageDialog(null, lottery);
	
}
}
