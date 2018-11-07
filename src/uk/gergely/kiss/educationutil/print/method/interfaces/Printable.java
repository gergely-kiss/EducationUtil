package uk.gergely.kiss.educationutil.print.method.interfaces;

public interface Printable<R, T> {
		public R execute(T input);
}