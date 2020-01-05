package Set3_50;

import java.util.Scanner;

/*3) String[] input1=["Vikas","Lokesh",Ashok]
		   expected output String: "Vikas,Lokesh,Ashok"*/

public class Q3_string {
	public static void main(String[] args) {

		System.out.println("Enter Array size ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();			//size of array

		String input[] = new String[size];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			input[i] = sc.next();				//initialization of array
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++)
			sb.append(input[i]).append(",");			//appending array elements and coma to sb

		sb.deleteCharAt(sb.length() - 1);			//deleting extra added comma

		System.out.println(sb);		//final output
	}

}
