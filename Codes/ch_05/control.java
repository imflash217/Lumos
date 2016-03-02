// Demonstrate the while loop
class While{
	public static void main(String args[]){
		int n = 10;
		
		// print a count from 10 to 1
		while(n>0){
			System.out.println("tick " + n);
			n--;
		} // end while
	} // end main
} // end class


// the target o fthe loop can be empty
class NoBody{
	public static void main(String args[]){

		int i, j;
		i = 100;
		j = 200;

		// find the midpoint of i, j
		while(++i < --j); // no body in this loop (semicolon is necessary)

		System.out.println("MidPoint is " + i); // this prints 150.

	} // end main
} // end class

// Demonstrate the do-while loop
class DoWhile{
	public static void main(String args[]){
		int n = 10;

		// print a count from 10 to 1
		do{
			System.out.println("tick " + n);
			n--;
		} while(n > 0);
	} // end main
} // end class


// Modified do-while loop
class DoWhile{
	public static void main(String args[]){
		int n = 10;

		// print a count from 10 to 1
		do{
			System.out.println("tick " + n);
		} while(--n > 0);  // first (--n) is executed then compared with 0 (> 0).
	} // end main
} // end class
 

 // using a do-while to process a menu selection
class Menu{
	public static void main(String args[]){
		throws java.io.IOException{
			char choice;
		}

		do {
			System.out.println("Help on:");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5. for\n");
			System.out.println("Choose one:");
			choice = (char) System.in.read(); // inputs are read from the keyboard via System.in.read() command
		} while(choice < '1' || choice > '5');

		System.out.println("\n");

		switch(choice){
			case '1' :
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
			break;
			case '2' :
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("	case constant:");
				System.out.println("		statement sequence");
				System.out.println("	break;");
				System.out.println("	//...");
				System.out.println("}");

		}
	}
}

// Parts of for loop can be emmpty
class ForVar{
	public static void main(String args[]){
		int i;
		boolean done = false;

		i = 0;
		for(; !done;){
			System.out.println("i is " + i);
			if(i == 10){ done = true};
			i++;
		}
	}
}


//  Use a for-each style for loop.
class ForEach{
	public static void main(String args[]){
		int nums[] = {1,2,3,4,5,6,7,8.9,10};
		int sum = 0;

		// use for-each style for to display and sum the values
		for(int x:nums){
			System.out.println("Value is: " + x);
			sum += x;
		}
		System.out.println("Summation is " + sum);
	}
}

// Use break to display and sum the values
class ForEach2{
	public static void main(String args[]){
		int sum = 0;
		int nums[] = {1,2,3,4,5,6,7,8,9,10};

		// use for to display and sum the values
		for( int x:nums){
			System.out.println("Value is: " + x);
			sum += x;
			if (x == 5) break; // stops the loop when 5 is obtained
		}
		System.out.println("Summation of first 5 elements: " + sum);
	}
}


// the for loop is essentially read-only
class NoChange{
	public static void main(String args[]){
		int nums[] = {1,2,3,4,5,6,7,8,9,10};

		for (int x:nums){
			System.out.print(x + " ");
			x *= 10; // no effect on nums[]
		}
		System.out.println(); // prints a blank line

		for(int x:nums){
			System.out.print(x + " ");
		}
		System.out.println(); // prints a blank line
	}
}


// Use for-each style for on a two-dimensional array
class ForEach3{
	public static void main(String args[]){
		int sum = 0;
		int nums[][] = new int[3][5];

		// give nums some value
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 5; j++){
				nums[i][j] = (i+1)*(j+1);
			} // end for
		} // end for

		// use for-each to display and sum the values
		for (int x[]:nums){   // here x is declared as a 1D int array.
			for(int y:x){     // here y is declared as an int.
				System.out.println("Value is: " + y);
				sum += y;
			} // end for
		} // end for

		System.out.println("Summation is: " + sum);

	} // end main
} // end class


// Search an array using for-each style for.
class Search{
	public static void main(String args[]){
		int nums[] = {6,8,10,3,19,87,23,45,2};
		int val = 2;
		boolean found = false;

		// use for-each style for to search nums for val
		for(int x:nums){
			if (x == val){
				found = true;
				break;
			} // end if
		} // for

		if(found){
			System.out.println("Value Found!!");
		} // end if
	} // end main
} // end class


// Loops can be nested
class Nested{
	public static void main(String args[]){
		int i,j;

		for(i=0; i<10; i++){
			for(j=i; j<10; j++){
				System.out.println(".");
			} // end for
			System.out.println();
		} // end for
	} // end main
} // end class

// Using 'break' to exit the loop
class BreakLoop{
	public static void main(String args[]){
		for(int i=0; i<100; i++){
			if(i == 10) break; // terminates the loop if i=10
			System.out.println("i= " + i);  // prints from i=0 to i=9
		}
		System.out.println("Loop complete!");
	} // end main
} // end class

// using 'break' to exit a while loop
class BreakLoop2{
	public  static void main(String args[]){
		int i = 0;

		while (i<100){
			if (i == 10) break; // terminate the loop when i = 10;
			System.out.println("i = " + i);
			i++;			
		}
		System.out.println("Loop Complete!!");
	} // end main
} // end class

// Using 'break' with nested loops.
class BreakLoop3{
	public static void main(String args[]){
		for (int i=0; i<3; i++){
			System.out.print("Pass " + i + ": ");
			for(int j=0; j<100; j++){
				if(j == 10) break; // terminate the loop when j = 10
				System.out.print(j + " ");
			} // end for
			System.out.println();
		} // end for
		System.out.println("Loops complete!!!")
	} // end main
} // end class

// Using 'break' as a civilized form of 'goto'
class Break{
	public static void main(String args[]){
		boolean t = true;

		first: {  // this block is labeled 'first'
			second: {	// this block is labeled 'second'
				third: {	// this block is labeled 'third'
					System.out.println("Before the break.");
					if(t) break second; // breaks out of the second block
					System.out.println("This won't execute");
				} // end third
				System.out.println("This won't execute.");
			} // end second
			System.out.println("This is after second block. This will execute.");
		} // end first
	} // end main
} // end class

// Using 'break' to exit from nested loops
class BreakLoop4{
	public static void main(String args[]){
		outer: for(int i=0; i<3; i++){  // this block is labeled 'outer'
			System.out.print("Pass " + i + ": ");
			for(int j=0; j<100; j++){
				if(j==10) break outer; // breaks out of the outer label loop
				System.out.print(j + " ");
			} // end for
			System.out.println("This will not be printed.");
		} // end outer
		System.out.println("Loops complete!!")
	} // end main
} // end class


// this program contains an error
class BreakError{
	public static void main(String args[]){

		one: for(int i=0; i<3; i++){
			System.out.print("Pass " + i + ": ");
		} // end one

		for (int j=0; j<100; j++){
			if(j==10) break one; // WRONG. 'break' cannot be used to break out of a block which does not enclose it.
			System.out.print(j + " ");
		} // end for
	} // end main
} // end class


// Demonstrate 'continue'
class Continue{
	public static void main(String args[]){
		for(int i=0; i<10; i++){
			System.out.print(i + " ");
			if(i%2 == 0) continue; // if 'i' is even then below code is not executed an dthe control goes back to start of 'for-loop'
			System.out.println();
		} // end for
	} // end main
} // end class


// Using 'continue' with a 'label'
class ContinueLabel{
	public static void main(String args[]){
outer: for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(j>i){
					System.out.println();
					continue outer; // if 'j>i' then the control goes to start of outer-for loop
				} // end if
				Syatem.out.print(" " + (i*j));
			} // end for
		} // end outer
		System.out.println();
	} // end main
} // end class


// Demonstrate return
class Return{
	public static void main(String args[]){
		boolean t = true;
		System.out.println("Before the return");
		if(t) return; // if t=true then the control goes to the caller of 'main'(as it contains 'return') method  
		System.out.println("This won't execute");
	} // end main
} // end class
