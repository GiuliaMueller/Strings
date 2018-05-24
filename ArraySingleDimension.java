package chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraySingleDimension {

	public static void main(String[] args) {

		// Unlike the ArrayList class, the regular arrays' equals() method
		// don't compare its contents, only it reference.
		Integer[] intArray1 = new Integer[] {6,4,2};
		Integer intArray2[] = new Integer[] {6,4,2};
		
		List<Integer> list1 = Arrays.asList(intArray1);
		List<Integer> list2 = Arrays.asList(intArray2);
		
		System.out.println(intArray1.equals(intArray2));
		System.out.println(list1.equals(list2));
		
		// Searching an UnSorted array, returns an unpredictable index value
		System.out.println(Arrays.binarySearch(intArray1, 6));
		
		// Searching a Sorted array, returns the index position, if found
		Arrays.sort(intArray1);		// sorted [2, 4, 6]
		System.out.println(Arrays.binarySearch(intArray1, 6));
		
		// When searching a sorted array, if the search entry is not found,
		// a negative value is returned: (index where searched entry would have been found * -1) -1
		System.out.println(Arrays.binarySearch(intArray1, 5));     // ((2 * -1) -1)
	}

}
