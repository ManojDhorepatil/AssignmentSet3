package Set3_50;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*8) INPUT1= helloworld
	 INPUT2= 2. 	Delete the char,if repeated twice.
if occurs more than twice,leave the first occurrence and delete the duplicate
O/P= helwrd;
*/

public class Q8_HelloWorld {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input 1 string  : ");
		String input1 = sc.next();
		int input2 = 2;

		LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
		int count = 0;
		String output="";
		for (int i = 0; i < input1.length(); i++) {
			
			for (int j = 0; j < input1.length(); j++)
				if (input1.charAt(i) == input1.charAt(j))
					count++;

			if (count == input2) 
				count = 0;				//if char is twice not going to add
			else {
				lhs.add(input1.charAt(i));		//if char is more than 2 or one time than add into lhs
				count=0;
			}
			
		}
		
		for(char c: lhs)	//for (type variableName : arrayName) { code block }
		{
			output+=c;			//store string in output
		}

		System.out.println(output);

	}

}
