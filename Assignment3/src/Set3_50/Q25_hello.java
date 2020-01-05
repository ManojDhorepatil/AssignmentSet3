package Set3_50;

/*25) input string="hello", n=2
output: lolo
*/
public class Q25_hello {
	public static void main(String[] args) {

		String str = "hello";
		int n = 2;

		String s1 = str.substring(str.length() - n, str.length());
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < n; i++) {
			sb.append(s1);
		}

		System.out.println(sb);
	}
}
