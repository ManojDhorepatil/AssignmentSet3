package Set3_50;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*23) HashMap<String,Integer> h1={“abc”:50,”efg”:70};
if the mark is less than 60 then put the output in the
HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}
*/
public class Q23_HashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("abc", 50);
		hm.put("def", 60);
		hm.put("efg", 70);
		hm.put("xyz", 85);
		hm.put("mnp", 40);
		System.out.println(hm);

		HashMap<String, String> hm2 = new HashMap<String, String>();
		String str1 = "";
		String str2 = "";
		int no = 0;

		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) 
		{
			str1 = (String) itr.next(); 		// to get the key value of hashmap
			no = hm.get(str1);					 // to get the value of that specified key

			if (no < 60)
				str2 = "fail";
			else
				str2 = "pass";

			hm2.put(str1, str2);
		}

		System.out.println(" Output :");
		System.out.println(hm2);

	}

}
