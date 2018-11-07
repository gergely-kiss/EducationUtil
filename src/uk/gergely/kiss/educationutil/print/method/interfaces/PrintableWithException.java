package uk.gergely.kiss.educationutil.print.method.interfaces;
/**
 * 
 * @author Kiss Gergely
 *
 * @param <InputType>
 * @param <OutputType>
 */
public interface PrintableWithException<InputType, OutputType> {
	/**
	 * 
	 * @param input
	 * @return
	 * @throws Exception
	 */
	public OutputType execute(InputType input) throws Exception;
}