package uk.gergely.kiss.educationutil.print.array;

/**
 * Utility class to print out one and two dimension array to the console
 * 
 * @author Kiss Gergely
 *
 */
public class PrintArray {

	/**
	 * Printing out one dimensional array to the console
	 * 
	 * @param array
	 */
	public static void printArray(Object[] array) {
		for (Object o : array)
			System.out.println(o);
	}

	/**
	 * Printing out two dimensional array to the console
	 * 
	 * @param array
	 */
	public static void printArray(Object[][] array) {
		for (Object[] oa : array) {
			for (Object o : oa) {
				System.out.print(o + "\t");
			}
			System.out.println();
		}
	}

}
