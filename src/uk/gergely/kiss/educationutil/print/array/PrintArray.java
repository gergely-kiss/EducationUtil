package uk.gergely.kiss.educationutil.print.array;

public class PrintArray {

	public static void printArray(Object[] array) {
		for (Object o : array)
			System.out.println(o);
	}

	public static void printArray(Object[][] array) {
		for(Object[] oa: array) {
			for(Object o : oa) {
				System.out.print(o + "\t");
			}
			System.out.println();
		}
	}
	
}
