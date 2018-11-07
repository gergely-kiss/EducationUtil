package uk.gergely.kiss.educationutil.print.method.interfaces;
/**
 * 
 * @author Kiss Gergely
 *
 * @param <InputType1>
 * @param <InputType2>
 * @param <OutputType>
 */
public interface BiPrintable<InputType1,InputType2, OutputType> {
	/**
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public OutputType execute(InputType1 input1, InputType2 input2);
}
