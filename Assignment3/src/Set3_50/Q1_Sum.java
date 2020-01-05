package Set3_50;
/*1) Find the sum of the numbers in the given input string array
Input{“2AA”,”12”,”ABC”,”c1a”)
Output:6 (2+1+2+1)
Note in the above array 12 must not considered as such
i.e,it must be considered as 1,2*/

import java.util.Scanner;

public class Q1_Sum {
	public static void main(String[] args) {
		
		  int sum = 0;
		  int size; 
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the Size of Array : ");
		  size = s.nextInt();									//array length

		  String[] input = new String[size]; 
		  System.out.println("Enter String : ");
		  for (int i = 0; i < input.length; i++){				//array initialization
		   input[i] = s.next();
		  }

		  char[] a = new char[100]; 		// Char Array for storing chars of string
		  for(int i=0;i<input.length;i++)		//for iterate the input array
		  {
			  a= input[i].toCharArray();				//store char
			  for(int j=0;j<input[i].length();j++)		//for checking particular array string of i
			  {
				  if(Character.isDigit(a[j]))			//checking digit value
				  {
					  sum=Character.getNumericValue(a[j])+sum;		//addition of numeric values one by one
				  }
			  }
		  }
		  
		  System.out.println(sum);				//final output

	}	
	
}
