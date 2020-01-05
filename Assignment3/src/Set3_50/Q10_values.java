package Set3_50;

import java.util.Scanner;

/*10) input1=1 ,input2=2 ,input3=3 --- output=6;
input1=1 ,input2=13,input3=3 --- output=1;
input1=13,input2=2 ,input3=8 --- output=8;
if value equal to 13,escape the value '13', as well as the next value to 13.
sum the remaining values
*/

public class Q10_values {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 inputs : ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int sum = 0;

		if (input1 == 13)
			sum += input3;				 // input 1&2 skip remaining add
		else if (input2 == 13)
			sum += input1; 				  // input 2&3 skip remaining add
		else if (input3 == 13)
			sum = input1 + input2; 			 // input3 skip remaining add
		else
			sum = input1 + input2 + input3;		//all add

		System.out.println("sum : " + sum);

	}
}
