package chapter3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		
		// Array lists can't contain primitives, however the int i gets autoBoxed to an Integer wrapper class
		for(int i = 0; i<10; i++)
			integers.add(i);
		
		integers.set(8, 8888);
		integers.add(5, 9999);
		integers.remove(8);     // remove() method arguments:  primitive uses index, Wrapper uses equals()
		integers.add(integers.size(), 10_000);
		
		List<Integer> integers2 = new ArrayList<>(integers);
		System.out.println("integers: "+integers);
		System.out.println("integers2: "+integers2);
		System.out.println(integers.equals(integers2)
				? "The ArrayLists are equal prior to sorting the second ArrayList" : "Not Equal");
		
		Collections.sort(integers2);
		System.out.println("integers: "+integers);
		System.out.println("integers2: "+integers2);
		System.out.println(integers.equals(integers2)
				? "equal" : "The two ArrayLists are no longer equal after sorting the second ArrayList.");
		
		if (integers.contains(8888) )
			integers.clear();
		System.out.println("After: "+integers);
		
		if(integers.isEmpty() & integers.size() ==0)
			System.out.println("ArrayList: integers, is empty");
		
		System.out.println(integers.equals(integers2)
				? "The two Array lists are equal after calling clear method." : "not equal");
		
	}	
	

}
