package uk.gergely.kiss.educationutil.print.method.printable;

/**
 * Enables the class to have a method with one input and one output to pass into
 * print class printMethod.
 * 
 * @author Kiss Gergely
 *
 * @param <InputType>
 * @param <OutputType>
 */
public interface Printable<InputType, OutputType> {
	/**
	 * To execute the method to print.
	 * 
	 * @param input
	 * @return output
	 */
	public OutputType execute(InputType input);
}