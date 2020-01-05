package Set3_50;

import java.util.Scanner;

/*11) input="hello"
output="hlo"; Alternative positions...
*/

public class Q11_Alternative {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the string : ");
		String input=sc.next();
	
		for(int i=0;i<input.length();i=i+2)
			System.out.print(input.charAt(i));
		
	}
}
