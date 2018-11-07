package uk.gergely.kiss.educationutil;

import uk.gergely.kiss.educationutil.print.array.PrintArray;
import uk.gergely.kiss.educationutil.print.method.PrintMethod;
import uk.gergely.kiss.educationutil.print.method.interfaces.BiPrintable;
import uk.gergely.kiss.educationutil.print.method.interfaces.Printable;
import uk.gergely.kiss.educationutil.test.TestObj;

public class EducationUtil {

	public static void main(String[] args) {

		String[] stringArray = { "str1", "str2", "str3" };
		String[][] string2dArray = { { "str11", "str12", "str13" }, { "str21", "str22", "str23" } };
		int[] intArray = { 1, 2, 3 };
		TestObj[] testObjArray = { new TestObj(stringArray[0], intArray[0]), new TestObj(stringArray[1], intArray[1]),
				new TestObj(stringArray[2], intArray[2]) };
		TestObj[][] testObj2dArray = {
				{ new TestObj(stringArray[0], intArray[0]), new TestObj(stringArray[1], intArray[1]),
						new TestObj(stringArray[2], intArray[2]) },
				{ new TestObj(stringArray[0], intArray[0]), new TestObj(stringArray[1], intArray[1]),
						new TestObj(stringArray[2], intArray[2]) } };

		PrintMethod.printMehod(1234567890, new PrintableTest());

		PrintMethod.printMehod(2, 3, new BiPrintableTest());

	}

	public static class PrintableTest implements Printable<Integer, Integer> {

		@Override
		public Integer execute(Integer input) {

			return reverseNumber(input);
		}

		private int reverseNumber(int input) {
			return reverseNumber(input, 0);
		}

		private int reverseNumber(int input, int reversed) {
			return input > 0 ? reverseNumber(input / 10, reversed * 10 + input % 10) : reversed;
		}
	}

	public static class BiPrintableTest implements BiPrintable<Integer, Integer, Integer> {

		@Override
		public Integer execute(Integer o, Integer p) {
			return powerOfNumber(o, p);
		}

		private int powerOfNumber(int base, int power) {
			return power > 0 ? base * powerOfNumber(base, power - 1) : base;
		}
	}

}
