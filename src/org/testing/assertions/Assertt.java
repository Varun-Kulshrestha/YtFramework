package org.testing.assertions;

public class Assertt {

	public static void assertion(String expected,String actual)
	{
		if(expected.equals(actual))
		{
			System.out.println("Assertion is getting passed");
		}
		else
		{
			System.out.println("Assertion is getting failed");
		}
	}
}
