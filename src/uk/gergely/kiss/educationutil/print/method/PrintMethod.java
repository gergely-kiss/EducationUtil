package uk.gergely.kiss.educationutil.print.method;

import uk.gergely.kiss.educationutil.print.method.biprintable.BiPrintable;
import uk.gergely.kiss.educationutil.print.method.biprintable.withexception.BiPrintableWithException;
import uk.gergely.kiss.educationutil.print.method.printable.Printable;
import uk.gergely.kiss.educationutil.print.method.printable.withexception.PrintableWithException;

/**
 * 
 * @author Kiss Gergely
 *
 */
@SuppressWarnings(value = { "unchecked", "rawtypes" })
public class PrintMethod {
	private String inputLabel;
	private String input1Label;
	private String input2Label;
	private String outputLabel;
	private String tabulator;
	private static final String INPUT_LABEL = "Input : ";
	private static final String INPUT_1_LABEL = "Input 1: ";
	private static final String INPUT_2_LABEL = "Input 2: ";
	private static final String OUTPUT_LABEL = "Output : ";
	private static final String TABULATOR = "\t";

	public PrintMethod() {
		super();
		init();
	}

	public PrintMethod(String inputLabel, String outputLabel) {
		super();
		init();
		this.inputLabel = inputLabel;
		this.outputLabel = outputLabel;

	}

	public PrintMethod(String input1Label, String input2Label, String outputLabel) {
		super();
		init();
		this.input1Label = input1Label;
		this.input2Label = input2Label;
		this.outputLabel = outputLabel;

	}

	public PrintMethod(String inputLabel, String input1Label, String input2Label, String outputLabel,
			String tabulator) {
		super();
		this.inputLabel = inputLabel;
		this.input1Label = input1Label;
		this.input2Label = input2Label;
		this.outputLabel = outputLabel;
		this.tabulator = tabulator;
	}

	private void init() {
		inputLabel = INPUT_LABEL;
		input1Label = INPUT_1_LABEL;
		input2Label = INPUT_2_LABEL;
		outputLabel = OUTPUT_LABEL;
		tabulator = TABULATOR;
	}

	/**
	 * Print the method input and output
	 * 
	 * @param input
	 * @param printable
	 */
	public void printMehod(Object input, Printable printable) {
		System.out.println(inputLabel + input + tabulator + outputLabel + printable.execute(input));
	}

	/**
	 * Print the method inputs and output
	 * 
	 * @param input1
	 * @param input2
	 * @param Biprintable
	 */
	public void printMehod(Object input1, Object input2, BiPrintable Biprintable) {
		System.out.println(input1Label + input1 + tabulator + input2Label + input2 + tabulator + outputLabel
				+ Biprintable.execute(input1, input2));
	}

	/**
	 * Print the method input and output and able to throw exception
	 * 
	 * @param input
	 * @param printable
	 * @throws Exception
	 */
	public void printMehod(Object input, PrintableWithException printable) throws Exception {
		System.out.println(inputLabel + input + tabulator + outputLabel + printable.execute(input));
	}

	/**
	 * Print the methods input and output and able to throw exception
	 * 
	 * @param input1
	 * @param input2
	 * @param Biprintable
	 * @throws Exception
	 */
	public void printMehod(Object input1, Object input2, BiPrintableWithException Biprintable) throws Exception {
		System.out.println(input1Label + input1 + tabulator + input2Label + input2 + tabulator + outputLabel
				+ Biprintable.execute(input1, input2));
	}

	public String getInputLabel() {
		return inputLabel;
	}

	public void setInputLabel(String inputLabel) {
		this.inputLabel = inputLabel;
	}

	public String getInput1Label() {
		return input1Label;
	}

	public void setInput1Label(String input1Label) {
		this.input1Label = input1Label;
	}

	public String getInput2Label() {
		return input2Label;
	}

	public void setInput2Label(String input2Label) {
		this.input2Label = input2Label;
	}

	public String getOutputLabel() {
		return outputLabel;
	}

	public void setOutputLabel(String outputLabel) {
		this.outputLabel = outputLabel;
	}

	public String getTabulator() {
		return tabulator;
	}

	public void setTabulator(String tabulator) {
		this.tabulator = tabulator;
	}
}
