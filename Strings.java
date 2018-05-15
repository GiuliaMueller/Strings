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
	}

}
