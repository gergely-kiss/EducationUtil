package uk.gergely.kiss.educationutil.print.method;

import uk.gergely.kiss.educationutil.print.method.interfaces.BiPrintable;
import uk.gergely.kiss.educationutil.print.method.interfaces.Printable;

@SuppressWarnings(value= {"unchecked", "rawtypes"})
public class PrintMethod {

	public static void printMehod(Object input,  Printable printable) {
		System.out.println("Input: " + input + "\tOutput: " + printable.execute(input));
	}

	public static void printMehod(Object input1, Object input2, BiPrintable Biprintable) {
		System.out.println("Input1: " + input1 + "\tInput2: " + input2 + "\tOutput: "
				+ Biprintable.execute(input1, input2));
	}
}
