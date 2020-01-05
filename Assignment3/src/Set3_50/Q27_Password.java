package Set3_50;

import java.util.Scanner;

/*27) Validate Password
validation based on following criteria:
-> minimum length is 8
-> should contain any of these @/_/#
-> should not start with number/special chars(@/#/_)
-> should not end with special chars
-> can contain numbers,letters,special chars
*/
public class Q27_Password {
	public static void main(String[] args) {

		//String password = "asg@#_12345";
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter password : ");
		String password =sc.next();
		
		int count = 0;
		int length = password.length();

		if (length >= 8) 
		{
			count++;
			
			int n = 0;
			for (int i = 0; i < length; i++) 
			{
				char ch = password.charAt(i);
				if (ch == '@' || ch == '_' || ch == '#')
					n++;
			}
			if (n > 0)
				count++;

			if (password.charAt(0) != '@' && password.charAt(0) != '#' && password.charAt(0) != '-' )
				count++;

			if (password.charAt(length - 1) != '@' && password.charAt(length - 1) != '#'
					&& password.charAt(length - 1) != '-')
				count++;
		}

		if (count == 4)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");

	}
}
