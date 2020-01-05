package Set3_50;

import java.util.Scanner;

/*
 12) Input1= ”Hello World”;  output = “dello WorlH”.
*/
public class Q12_positions {
	public static void main(String[] args) {

		Scanner se = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = se.nextLine();

		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);

		String n[] = s.split(" ");
		
		String n1 = n[0];
		String n2 = n1.replace(n1.charAt(0), last);

		String n3 = n[1];
		String n4 = " " + n3.replace(n3.charAt(n3.length() - 1), first);

		System.out.println(n2.concat(n4));

	}
}
