package Set3_50;

import java.util.StringTokenizer;

/*21) input1-- Hello*world
output-- boolean(true or false)
operation-- if the character before and after * are same return true else false
            if there in no star in the string return false(Ignore case)
*/

public class Q21_HelloWorld {
	public static void main(String[] args) {
		
		 String input="Hello*world"; 
		 int n=0;
		 boolean b=false;
		 
		 for(int i=0;i<input.length();i++)
		 {
			 char ch=input.charAt(i);
			 if(ch == '*')
				 n=i;
		 }
		 
		 String s1=input.substring(0, n);
		 String s2=input.substring(n+1,input.length());
		 
		if(s1.equalsIgnoreCase(s2))
			b=true;
			
		 System.out.println( b );
		
	}
}
