package Set3_50;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*17) input-- String input1="AAA/abb/CCC"
char input2='/'
output-- String[] output1;
output1[]={"aaa","bba","ccc"};

operation-- get the strings from input1  using stringtokenizer
            reverse each string
            then to lower case
            finally store it in output1[] string array
*/

public class Q17_String {
	public static void main(String[] args) {
		
		String input1="AAA/abb/CCC";	
		String input2="/";
		
		List<String> lt=new ArrayList<String>();
		
		StringTokenizer st= new StringTokenizer(input1, input2);
		while (st.hasMoreTokens()) {
			StringBuffer sb = new StringBuffer(st.nextToken().toLowerCase());
			lt.add(sb.reverse().toString());
		}
		
		System.out.println(lt);
		
		
		
	}
}
