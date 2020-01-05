package Set3_50;

import java.util.Scanner;

/*16) int[] input={2,1,4,1,2,3,6};
check whether the input has the sequence of "1,2,3". if so-
output=true;
int[] input={1,2,1,3,4,5,8};
output=false
*/
public class Q16_Sequence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size = sc.nextInt();

		int[] input = new int[size];
		System.out.println("enter the array elements : ");
		for (int i = 0; i < size; i++)
			input[i] = sc.nextInt();

		int count = 0;
		for (int i = 0; i < input.length - 1; i++) 
		{
			if (input[i] == 1) 
			{
				if (input[i + 1] == 2 && input[i + 2] == 3)
					count++;
			}

		}
		if (count > 0)
			System.out.println(" True : " + count);
		else
			System.out.println(" False ");

	}
}
