package Set3_50;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*6) I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
i/p 2="hari";
o/p string[]={"ram","cts"};
*/

public class Q6_HashMap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of hashmap : ");
		int size= sc.nextInt();
		
		System.out.println("Enter keys and values as Key:Value ");
		
		HashMap<String, String> hmap= new HashMap<String, String>();
		for(int i=0;i<size;i++)
		{
			String str=sc.next();
			String key=str.split(":")[0];
			String value=str.split(":")[1];
			hmap.put(key, value);
		}
		
		System.out.println("Enter value to check keys ");
		String val=sc.next();
		
		for(Map.Entry<String, String> entry : hmap.entrySet())
		{
			if(entry.getValue().equalsIgnoreCase(val))
				System.out.print(entry.getKey() + " ");
		}
		
	}
	
}
