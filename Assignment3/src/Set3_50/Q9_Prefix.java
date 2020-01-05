package Set3_50;

/*9) String[] input={"100","111","10100","10","1111"} input2="10"
output=2;count strings having prefix"10" but "10" not included in count
operation-- for how many strings input2 matches the prefix of each string in input1

String[] input={"01","01010","1000","10","011"}
output=3; count the strings having prefix"10","01" but "10","01" not included
*/

public class Q9_Prefix {
	public static void main(String[] args) {

		String[] input = { "100", "111", "10100", "10", "1111" };
		String input2 = "10";
		int count = 0;

		for (int i = 0; i < input.length; i++) 
		{
			String str = input[i];
			if (str.length() > input2.length()) // checking length of strings
			{
				if (str.charAt(0) == input2.charAt(0) && str.charAt(1) == input2.charAt(1)) // checking prefix
				{
					count++;
				}
			}
		}

		System.out.println("output : " + count);

	}
}
