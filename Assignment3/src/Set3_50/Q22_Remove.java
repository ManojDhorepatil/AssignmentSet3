package Set3_50;

import java.util.Scanner;

/*22) input --String input1 ="xaXafxsd"
output--String output1="aXafsdxx"
operation-- remove the character "x"(only lower case) from string and place at the end
*/

public class Q22_Remove {
	public static void main(String[] args) {

		//String input = "xaXaxfsd";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  input : ");
		String input = sc.next();

		StringBuffer sb = new StringBuffer(input);
		int j = 0;
		for (int i = 0; i < sb.length(); i++)
			if (sb.charAt(i) == 'x') {
				sb.deleteCharAt(i);
				j++;
			}
		for (int i = 0; i < j; i++)
			sb.append('x');
		
		System.out.println(sb.toString()); 
	}
}
