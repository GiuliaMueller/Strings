package chapter3;

public class Strings {
	public static void main(String[] args) {
		// concatenating Strings with numbers and boolean
		System.out.println(1 + "2" + 3);
		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);
		System.out.println("1" + "2" +true+ 3);
		
		// Strings are immutable, its methods create new String
		// objects, and return the new String object.
		String immutable = "Can't be changed";
		System.out.println(immutable);
		System.out.println(immutable.replace("Can't be changed", "Or can it?"));
		System.out.println(immutable);
		
		// How many String objects will be instantiated during execution
		// of the following code block?
		String one = null, two = null;
		for (int i=0; i<10; i++) {
			one = "Permanent String";
			two = new String ("Temporary String");
			// Answer is 11 String objects were instantiated,
			// one to the String Pool, and ten to the Heap.
		}
		
		// The String class' method are available to String literal
		System.out.println("abcdefg".toUpperCase());
				
	}

}
