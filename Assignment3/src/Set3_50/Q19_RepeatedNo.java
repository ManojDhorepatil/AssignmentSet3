package Set3_50;

import java.util.Scanner;

/*19) input---input1=1;
input2=4;
input3=1;
output1=4;
operation--- print the element which is not repeated    
if all the inputs r different sum all inputs
input---input1=1;
input2=2;
input3=3;
output1=6;
*/

public class Q19_RepeatedNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 inputs : ");
		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		int ip3 = sc.nextInt();

		int output = 0;

		if (ip1 != ip2 && ip2 != ip3 && ip1 != ip3)
			output = ip1 + ip2 + ip3;
		else if (ip1 == ip2 && ip2 == ip3)
			output = 0;
		else {
			if (ip1 == ip2)
				output = ip3;
			else if (ip2 == ip3)
				output = ip1;
			else if (ip1 == ip3)
				output = ip2;
		}
		
		System.out.println("Output: "+output);
	}
}
