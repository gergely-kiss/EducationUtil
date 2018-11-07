package uk.gergely.kiss.educationutil.test;

public class TestObj {

	private String testString;
	private int testInt;
	
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public int getTestInt() {
		return testInt;
	}
	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}
	public TestObj(String testString, int testInt) {
		super();
		this.testString = testString;
		this.testInt = testInt;
	}
	@Override
	public String toString() {
		return "TestObj [testString=" + testString + ", testInt=" + testInt + "]";
	}
}
