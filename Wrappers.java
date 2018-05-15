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
		
		
	}

}
