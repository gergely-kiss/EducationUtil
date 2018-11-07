package uk.gergely.kiss.educationutil.print.method.interfaces;
/**
 * 
 * @author Kiss Gergely
 *
 * @param <InputType1>
 * @param <InputType2>
 * @param <OutputType>
 */
public interface BiPrintableWithException<InputType1, InputType2, OutputType> {
	/**
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 * @throws Exception
	 */
	public OutputType execute(InputType1 input1, InputType2 input2) throws Exception;
}
