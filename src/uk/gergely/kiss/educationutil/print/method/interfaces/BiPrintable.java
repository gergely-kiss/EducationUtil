package uk.gergely.kiss.educationutil.print.method.interfaces;

public interface BiPrintable<P,R, T> {
	public T execute(P input1, R input2);
}
