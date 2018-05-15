package chapter3;
import java.util.HashMap;
public class Wrappers {
	public static void main(String[] args) {
		// Non-Number primitives
		boolean b1 = true; 		char c = 'a';
		
		// Numeric primitives
		byte b = 123;		short s = 123;			int i = 123;
		long l = 123L;		float f = 123.450F;		double d = 123.456D;
		
		// Java provides Wrapper Classes for all primitive types
		Character cw = new Character(c);
		Boolean blw = new Boolean(b1);
		
		// Display Number Wrapper's max value
		System.out.println("Byte range: from " + new Byte(b).MIN_VALUE +
				" to " +new Byte(b).MAX_VALUE );
		System.out.println("Short range: from " + new Short(s).MIN_VALUE +
				" to " +new Short(s).MAX_VALUE );
		System.out.println("Integer range: from " + new Integer(i).MIN_VALUE +
				" to " +new Integer(i).MAX_VALUE );
		System.out.println("Long range: from " + new Long(l).MIN_VALUE +
				" to " +new Long(l).MAX_VALUE );
		System.out.println("Float range: from " + new Float(f).MIN_VALUE +
				" to " +new Float(f).MAX_VALUE );
		System.out.println("Double range: from " + new Double(d).MIN_VALUE +
				" to " +new Double(d).MAX_VALUE );
		System.out.println();
		System.out.println("Character max value: ");
		System.out.println(new Character(c).MAX_VALUE + 0 );
	}

}
