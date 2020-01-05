package Set3_50;

import java.util.Scanner;

/*5) Square root calculation of
((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
o/p should be rounded of to int;
*/
public class Q5_SquareRoot {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter x1 , x2 ,y1 & y2 values : ");
		int x1= sc.nextInt();
		int x2=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		
		double input =((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
		
		System.out.println("expression result : "+input);
		double output=Math.sqrt(input);
		
		System.out.println("output is : "+ Math.round(output));
	}
}
