package Set3_50;

import java.util.Scanner;


/*4) Email Validation
String input1="test@gmail.com"
             1)@ & . should be present;
             2)@ & . should not be repeated;
             3)there should be five characters between @ and .;
             4)there should be atleast 3 characters before @ ;
             5)the end of mail id should be .com;
*/

public class Q4_EmailValidation {
	public static void main(String[] args) {

		// String email="test@gmail.com";

		System.out.println("Enter email address ");
		Scanner sc = new Scanner(System.in);
		String email = sc.next();

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int position31 = 0;
		int position32 = 0;

		for (int i = 0; i < email.length(); i++) {
			char ch = email.charAt(i);

			if (ch == '@' || ch == '&' || ch == '.')
			{
				count1++;		//1)contain @ & .

				if (ch == '@') 
				{
					count2++;			//checking @ is not repeating
					count4 = i;			//checking chars before @
					position31 = i;		//for position of @ 
				}
				if (ch == '&')
				{
					count2++;			//checking & is not repeating
				}
				if (ch == '.') {
					count2++;			//checking . is not repeating
					position32 = i;		//for position of .

					String str = email.substring(i, email.length()); 		//storing after . string
					// System.out.println(str);
					if (str.equals(".com"))					//5)checking end with ".com"
						count5++;
				}

			}

		}
		
		if(position32-position31 >= 5)		//3)Checking chars between @ and .
			count3++;

		System.out.println("count1 :" + count1 + " count2 :" + count2 + " count3 :" + count3 + 
				" count4 :" + count4+ " count5 :" + count5);

		if (count1 == 3 && count2 == 3 && count3 == 1 && count4 >= 3 && count5 == 1) 
		{
			System.out.println("valid email address");
		} else
		{
			System.out.println("not valid");
		}
		
	}
}
