package org.test;

public class Sample {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 10;
			int result = b / a;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("toString(): " + e.toString());
			System.out.println(e.getMessage());
			System.out.println("StackTrace: ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Success");
		}
	}
}
