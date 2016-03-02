//Demonstarate a one-dimensional array
class Array{
	public static void main(String args[]){
		int month_days[];
		month_days = new int[12];
		// int month_days[] = new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		System.Out.println("April has " + month_days[3] + "days.");
	}
}

// An improved version of the previous program.
class AutoArray{
	public static void main (String args[]){
		int month_days[] = {31,28,30,31,30,31,30,31,30,31,30,31};
		System.Out.println("April has " + month_days[3] + " days.");
	}
}

//Average an array of values.
class Average{
	public static void main(String args[]){
		double nums[] = {10.2,11.2,12.3,13.4,14.5};
		double result = 0;
		int i;
		for (i=0; i<5; i++){
			result = result + nums[i];
		}
		System.Out.println("Average is " + (result/5);
	}
}


// Multi dimensional array.
class TwoDArray{
	public static void main(String args[]){
		int twoD[][] = new int[4][5];
		int i, j, k=0;

		for (i=0; i<4; i++){
			for (j=0; j<5; j++){
				twoD[i][j] = k;
				k++;
			}
		}
// 
		for (i=0; i<4; i++){
			for (j=0; j<5; j++){
				System.Out.print(twoD[i][j] + " ");
			}
			System.Out.println();
		}
// 
	} // end main
} // end class

// Manually allocate differing size dimensions
class TwoDAgain{
	public static void main(String args[]){
		int twoD[][] = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];

		int i, j, k=0;
		for (i=0; i<4; i++){
			for (j=0; j<i+1; j++){
				twoD[i][j] = k;
				k++;
			}
		}

		for (i=0; i<4; i++){
			for (j=0; j<i+1; j++){
				System.Out.print(twoD[i][j] + " ");
			}
			System.Out.println();
		}
	} // end main
//
} // end class

// Initialize a two dimensional array
class Matrix{
	public static void main(String args[]){
		double m[][] = {
			{0*0, 1*0, 2*0, 3*0},
			{0*1, 1*1, 2*1, 3*1},
			{0*2, 1*2, 2*2, 3*2},
			{0*3, 1*3, 2*3, 3*3}
		};
		int i,j;

		for (i=0; i<4; i++){
			for (j=0; j<4; j++){
				System.Out.print(m[i][j] + " ");
			}
			System.Out.println();  /// prints a new line
		}

	} // end main
} // end class


// Demonstrate the three dimensional array
class ThreeDMatrix{
	public static void main(String args[]){
		int threeD[][][] = new int [3][4][5];
		int i, j, k;

		for (i=0; i<3; i++){
			for (j=0; j<4; j++){
				for (k=0; k<5; k++){
					threeD[i][j][k] = i*j*k;
					System.Out.print(threeD[i][j][k] + " ");
				}
				System.Out.println();
			}
			System.Out.println();
		}

	} // end main
} // end class

