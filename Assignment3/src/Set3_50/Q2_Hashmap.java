package Set3_50;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*2) Create a program to get the hashmap from the given input string array where the key for the hashmap
is first three letters of array element in uppercase and the value of hashmap is the element itself	

	Input:{“goa”,”kerala”,”gujarat”}                 [string array]
	Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]
*/

//HashMap is a Map based collection class that is used for storing Key & value pairs,
//it is denoted as HashMap<Key, Value> or HashMap<K, V>.

//Set is an interface which extends Collection. 
//It is an unordered collection of objects in which duplicate values cannot be stored.
public class Q2_Hashmap {
	public static void main(String[] args) {

		System.out.println("Enter Array size ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String input[] = new String[size];
		System.out.println("Enter string array elements : ");
		for (int i = 0; i < size; i++)
			input[i] = sc.next();
		
		HashMap<String, String> hm= new HashMap<String, String>();
		
		for(int i=0;i<input.length;i++)
		{
			hm.put(input[i].substring(0, 3).toUpperCase(),input[i]);
		}
		
		System.out.println(hm);
		
		
		/*Set set =hm.entrySet();				//entrySet returns a set having same elements as the hash map
		Iterator itr=set.iterator();		//iterator retrieve elements one by one	
		while(itr.hasNext())
		{
			Map.Entry mentry=(Map.Entry)itr.next();	//provide methods to access the entry in the Map.
			System.out.println("{"+mentry.getKey()+","+mentry.getValue()+"}");
		}
*/
	}
}
