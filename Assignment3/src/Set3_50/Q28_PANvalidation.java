package Set3_50;

import java.util.Scanner;

/*28) pan card number validation:
    all letters shud be in caps,shud be of 8 chars.
    first three letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet
*/
public class Q28_PANvalidation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter pan number : ");
		String pan = sc.next();
		int count=0;

		if (pan.length() == 8) 
		{
			count++;
			for(int i=0;i<3;i++)
			{
				count++;
			}
			for(int i=3;i<7;i++)
			{
				count++;	
			}
			if((pan.length()-1) != 0)
				count++;
		}
		
		if (count == 4)
			System.out.println("Valid PAN number");
		else
			System.out.println("Invalid PAN number");

		
	}
}
