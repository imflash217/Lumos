// Demonstrate method overloading
class OverloadDemo{
	void test(){
		System.out.println("No Parameters!");
	} // end test()

	// overload test for one integer parameter
	void test(int a){
		System.out.println("a: " + a);
	} // end test(int)

	// overload test for two integer parameter
	void test(int a, int b){
		System.out.println("a and b: " + a + ", " + b);
	} // end test(int, int)

	// overload test for double parameter
	double test(double d){
		System.out.println("double d: " + d);
		return d*d;
	} // end test(double)
} // end class OverloadDemo

class main_01{
	public static void main(String args[]){
		OverloadDemo ob = new OverloadDemo();
		double result;

		// call all versions of test
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result = ob.test(1.5);
		System.out.println("Result of ob.test(1.5): " + result);
	} // end main
} // end class main_01
