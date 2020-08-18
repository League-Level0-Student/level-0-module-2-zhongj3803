package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class Intro {
public static void main(String[] args) {
	String quantity = JOptionPane.showInputDialog("Enter a number here.");
	Integer.parseInt(quantity);
	int num = Integer.parseInt(quantity);
	System.out.println(num);
}
}
