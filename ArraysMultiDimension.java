package chapter3;

public class ArraysMultiDimension {

	public static void main(String[] args) {
		String message = new String();
		
		try {
			// Can't assign size value in declaration
			// String[2] [2] multiDimen2 = new String [][];
			
			// Only the top level array requires a size value initialization 
			// String multidimen2[][] = new String[2][];
			// multiDimen2[0] = new String[2];
			// multiDimen2[1] = new String[3];
			
			// Size initializer value is not zero based
			// String [][] multiDimen2 = new String[0][0];
			
			String[] multiDimen2[] = new String[2][3];
			multiDimen2[0][0] = "one";
			multiDimen2[0][1] = "two";
			multiDimen2[1][0] = "three";
			multiDimen2[1][1] = "four";
			multiDimen2[1][2] = "five";
			
			for(String[] array : multiDimen2)
				for(String string : array)
					System.out.print(string+" ");
			
		}catch (Exception e) {e.printStackTrace();}
		System.out.println(message);
	}

}
