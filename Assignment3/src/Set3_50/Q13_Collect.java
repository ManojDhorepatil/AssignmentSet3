package Set3_50;

import java.util.ArrayList;
import java.util.List;

/*13) Collect no’s frm list1 which is not present in list2 
& Collect no’s frm list2 which is not present in list1
and store it in output1[].
ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};
*/

public class Q13_Collect {
	public static void main(String[] args) {

		List<Integer> input1 = new ArrayList<>();
		input1.add(1);
		input1.add(2);
		input1.add(3);
		input1.add(4);

		List<Integer> input2 = new ArrayList<>();
		input2.add(1);
		input2.add(2);
		input2.add(3);
		input2.add(5);
		
		System.out.println("input 1 : "+input1);
		System.out.println("input 2 : "+input2);
		
		List<Integer> list = new ArrayList<>();  		//creating temp list for storing input1 elements
		
		list.addAll(input1); 		//adding input1 elements to list
		input1.removeAll(input2);
		input2.removeAll(list);
		
		input1.addAll(input2);
		
		System.out.println("Output : "+input1);

	}
}
