package Set3_50;

import java.util.Scanner;

/*
 14) String array will be given.if a string is Prefix of an any other string in that array means count.
*/

public class Q14_stringArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		System.out.println("enter 5 strings : ");
		for (int i = 0; i < str.length; i++)
			str[i] = sc.next();

		int count = 0;
		for (int i = 0; i < str.length; i++)
		{
			for (int j = i + 1; j < str.length; j++) 
			{
				String prefix = str[i];
				String prefix2 = str[j];
				char ch1=prefix.charAt(0);
				char ch2=prefix2.charAt(0);

				if (ch1 == ch2)
					count++;
			}
		}
		
		System.out.println("count : "+count);

	}
}
