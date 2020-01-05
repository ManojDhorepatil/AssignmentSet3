package Set3_50;

import java.util.Scanner;

/*7) Input1={“ABX”,”ac”,”acd”};
Input2=3;
Output1=X$d
*/
public class Q7_Input {
	public static void main(String[] args) 
	{
		// String[] input1 = { "abc", "da", "ram", "cat" };
		
		Scanner sc = new Scanner(System.in);
		
		String input1[] = new String[3];
		System.out.println("Enter input 1 string elements : ");
		for (int i = 0; i < input1.length; i++) {
			input1[i] = sc.next();				//initialization of string elements
		}
		
		System.out.println("Enter input 2 : ");
		int input2 = sc.nextInt();			// = 3;

	
		
		
		for(int i=0;i<input1.length;i++)
		{
			String str=input1[i];
			if(str.length() >=  input2)				//if size greater or equal to input2
			{
				System.out.print(str.charAt(input2-1));			//then print at position of input2 char 
			}
			else
				System.out.print("$");			//else print $
		}
		
	}

}
