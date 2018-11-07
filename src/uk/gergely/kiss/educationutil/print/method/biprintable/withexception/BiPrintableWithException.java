package uk.gergely.kiss.educationutil.print.method.biprintable.withexception;

/**
 * Enables the class to have a method with two inputs and one output to pass
 * into print class printMethod for methods with throwable exceptions.
 * 
 * @author Kiss Gergely
 *
 * @param <InputType1>
 * @param <InputType2>
 * @param <OutputType>
 */
public interface BiPrintableWithException<InputType1, InputType2, OutputType> {
	/**
	 * To execute the method to print. For methods with throwable exceptions.
	 * 
	 * @param input1
	 * @param input2
	 * @return output
	 * @throws Exception
	 */
	public OutputType execute(InputType1 input1, InputType2 input2) throws Exception;
}
