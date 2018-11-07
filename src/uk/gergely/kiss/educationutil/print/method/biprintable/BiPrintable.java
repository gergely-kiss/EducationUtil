package uk.gergely.kiss.educationutil.print.method.biprintable;

/**
 * Enables the class to have a method with two inputs and one output to pass
 * into print class printMethod.
 * 
 * @author Kiss Gergely
 *
 * @param <InputType1>
 * @param <InputType2>
 * @param <OutputType>
 */
public interface BiPrintable<InputType1, InputType2, OutputType> {
	/**
	 * To execute the method to print.
	 * 
	 * @param input1
	 * @param input2
	 * @return output
	 */
	public OutputType execute(InputType1 input1, InputType2 input2);
}
