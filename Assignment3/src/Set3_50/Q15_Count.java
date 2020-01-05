package Set3_50;

import java.util.Scanner;
import java.util.StringTokenizer;

/*15) count the number of words in the string
Input string="i work in cognizant.";
output=4;
*/

public class Q15_Count {
	public static void main(String[] args) {

		String input = "i work in cognizant.";
		
		StringTokenizer st = new StringTokenizer(input, " ");
		int count = st.countTokens();
		
		System.out.println("count : "+count);
	}

}
