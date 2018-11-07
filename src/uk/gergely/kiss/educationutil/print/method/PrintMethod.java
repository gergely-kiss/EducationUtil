package uk.gergely.kiss.educationutil.print.method;

import uk.gergely.kiss.educationutil.print.method.interfaces.BiPrintable;
import uk.gergely.kiss.educationutil.print.method.interfaces.BiPrintableWithException;
import uk.gergely.kiss.educationutil.print.method.interfaces.Printable;
import uk.gergely.kiss.educationutil.print.method.interfaces.PrintableWithException;

/**
 * 
 * @author Kiss Gergely
 *
 */
@SuppressWarnings(value = { "unchecked", "rawtypes" })
public class PrintMethod {
	/**
	 * 
	 * @param input
	 * @param printable
	 */
	public static void printMehod(Object input, Printable printable) {
		System.out.println("Input: " + input + "\tOutput: " + printable.execute(input));
	}

	/**
	 * 
	 * @param input1
	 * @param input2
	 * @param Biprintable
	 */
	public static void printMehod(Object input1, Object input2, BiPrintable Biprintable) {
		System.out.println(
				"Input1: " + input1 + "\tInput2: " + input2 + "\tOutput: " + Biprintable.execute(input1, input2));
	}

	/**
	 * 
	 * @param input
	 * @param printable
	 * @throws Exception
	 */
	public static void printMehod(Object input, PrintableWithException printable) throws Exception {
		System.out.println("Input: " + input + "\tOutput: " + printable.execute(input));
	}

	/**
	 * 
	 * @param input1
	 * @param input2
	 * @param Biprintable
	 * @throws Exception
	 */
	public static void printMehod(Object input1, Object input2, BiPrintableWithException Biprintable) throws Exception {
		System.out.println(
				"Input1: " + input1 + "\tInput2: " + input2 + "\tOutput: " + Biprintable.execute(input1, input2));
	}
}
