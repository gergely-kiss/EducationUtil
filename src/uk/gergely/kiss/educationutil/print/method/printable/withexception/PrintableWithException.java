package uk.gergely.kiss.educationutil.print.method.printable.withexception;

/**
 * Enables the class to have a method with one input and one output to pass into
 * print class printMethod for methods with throwable exceptions.
 * 
 * @author Kiss Gergely
 *
 * @param <InputType>
 * @param <OutputType>
 * @throws Exception
 */
public interface PrintableWithException<InputType, OutputType> {
	/**
	 * To execute the method to print. For methods with throwable exceptions.
	 * 
	 * @param input
	 * @return output
	 * @throws Exception
	 */
	public OutputType execute(InputType input) throws Exception;
}