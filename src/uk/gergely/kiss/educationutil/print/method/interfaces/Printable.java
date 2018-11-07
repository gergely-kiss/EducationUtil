package uk.gergely.kiss.educationutil.print.method.interfaces;
/**
 * 
 * @author Kiss Gergely
 *
 * @param <InputType>
 * @param <OutputType>
 */
public interface Printable<InputType, OutputType> {
	/**
	 * 
	 * @param input
	 * @return
	 */
	public OutputType execute(InputType input);
}