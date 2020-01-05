package Set3_50;

/*18) Input1=”cow”; Output1=”cowcow”;
Input1=”so”;output1=”sososo”; 
HINT: if they give 3 letter word u have to display 2 time;
*/

public class Q18_Letter {
	public static void main(String[] args) {

		String ip1 = "so";
		

		StringBuffer sb = new StringBuffer();
		int n1 = ip1.length();
		
		if (n1 == 3)
			for (int i = 0; i < n1 - 1; i++)
				sb.append(ip1.substring(0, n1));
		else if (n1 == 2)
			for (int i = 0; i < n1 + 1; i++)
				sb.append(ip1.substring(0, n1));
		else
			sb.append(ip1);
		
		
		System.out.println(sb.toString());
	}
}
