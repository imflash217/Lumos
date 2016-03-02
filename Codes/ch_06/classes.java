class classname{
	type instance-variable1;
	type instance-variable2;
	//......
	type instance-variableN;

	type methodname1(parameter-list){
		// body of method
	}

	type methodname2(parameter-list){
		// body of method
	}

	//.......
	type methodnameN(parameter-list){
		// body of method
	}
} // end class

////////////////////////////////////////////////////////////////////////////
/* 
	A program that uses the Box class.
	Call this file BoxDemo.java
*/

class Box{
	double width;
	double height;
	double depth;
}

// This class declares an object of type Box.
class BoxDemo{
	public static void main(String args[]){
		Box mybox = new Box();
		double vol;

		// assign values to mybox's instance variables.
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
	} // end main
} // end class BoxDemo

////////////////////////////////////////////////////////////////////////////

// This program declares two Box classes

class BoxDemo2{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 6;
		mybox1.depth = 9;

		// assign values to mybox2's instance variables
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 23;

		// compute the volume of mybox1
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);

		// compute the volume of mybox2
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);
	} // end main
} // end class BoxDemo2

////////////////////////////////////////////////////////////////////////////

// This program includes a method inside the box class
class Box{
	double width;
	double height;
	double depth;

	// display volume of a box
	void volume(){
		System.out.print("Volume is ");
		System.out.println(width*height*depth);
	} // end method volume()
} // end class Box

class BoxDemo3{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		// assign values to mybox2's instance variables
		mybox2.width = 2;
		mybox2.height = 4;
		mybox2.depth = 9;

		// display volume of mybox1
		mybox1.volume(); // calls volume method of mybox1

		// display volume of mybox2
		mybox2.volume();
	} // end main
} // end class BoxDemo3

////////////////////////////////////////////////////////////////////////////

// This program uses a parametrized method
class Box{
	double width, height, depth;

	// compute and return volume
	double volume(){
		return (width*height*depth);
	} // end volume()

	// sets dimensions of box
	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	} // end setDim()
} // end class Box

class BoxDemo5{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		// initialize each box
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);

		// get volume of mybox1
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		// get volume of mybox2
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	} // end main
} // end class BoxDemo5

////////////////////////////////////////////////////////////////////////////

/* Here, Box uses a 'constructor' to initialize the dimensions of a box. */

class Box{
	double width, height, depth;

	// This is the 'constructor' for Box.
	Box(){
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	} // end constructor Box()

	// compute and return volume
	double volume(){
		return (width * height * depth);
	} // end volume()
} // end class Box

class BoxDemo6{
	public static void main(String args[]){
		// Declare, allocate and initialize Box objects
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol;

		// get volume of 1st box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		// get volume of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	} // end main
} // end class BoxDemo6

////////////////////////////////////////////////////////////////////////////

// Here, Box uses a parametrized constructor to initialize the dimensions of a box

class Box{
	double width, height, depth;

	// This is the 'constructor' for Box.
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	} // end constructor Box

	//compute and return volume
	double volume(){
		return (width*height*depth);
	} // end volume()
} // end class Box()

class boxDemo7{
	public static void main(String args[]){
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box(3,6,9);
		double vol;

		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	} // end main
} // end class BoxDemo7

////////////////////////////////////////////////////////////////////////////

// This class defines an integer stack that can hold 10 values.

class Stack{
	int stck[] = new int[10];
	int tos;

	// initialize top of stack using its constructor
	Stack(){
		tos = -1;
	} // end constructor Stack()

	// push an item onto a stack
	void push(int item){
		if(tos == 9)
			System.out.println("Stack is Full.");
		else
			stck[++tos] = item;
	} // end push

	// pop an item from the stack
	int pop(){
		if(tos < 0){
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[tos--];
	} // end pop
} // end class Stack

class TestStack{
	public static void main(String args[]){
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		// push some numbers onto the stack
		for(int i=0; i<10; i++)
			mystack1.push(i);

		for (int i=10; i<20; i++ )
			mystack2.push(i);

		// pop those numbers off the stack
		System.out.println("Stack in mystack1: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack1.pop());

		System.out.println("Stack in mystack2: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());
	} // end main
} // end class TestStack()

////////////////////////////////////////////////////////////////////////////
