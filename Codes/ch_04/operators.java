// Left shift a byte value
class ByteShift{
	static public void main(String args[]){
		byte a =64, b;   // a = 0100 0000
		int i;
		i = a << 2; 
		b = (byte) (a <<2); // here a = 0000 0000 0100 0000 (byte is upgradede to int during operations)
							// and  b = 0000 0000 (due to use of casting after bit shift)

		System.out.println("Original value of a = " + a);
		System.out.println("i and b : " + i + " " + b);
	
	} // end main
} // end class

// Left shifting as a quick way to multiply by 2
class MultByTwo{
	static public void main(String args[]){
		int i;
		int num = 0xFFFFFFE;

		for (i=0; i<4; i++){
			num = num <<1;
			System.out.println(num);
		}
	} // end main
} // end class

// Unsigned shifting a byte value
class ByteUShift{
	static public void main(String args[]){
		char hex[] = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};

		byte b = (byte) 0xf1; // oxf1 = 1111 0001
		byte c = (byte) (b >> 4); // right shift by 4 bits
		byte d = (byte) (b >>> 4); // UNSIGNED right shift by 4 bits
		byte e = (byte) ((b & 0xff) >> 4);

		System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
		System.out.println("        b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
		System.out.println("         b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
		System.out.println("              b = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
	} // end main
} // end class

class OpBitEquals{
	public static void main(String args[]){
		int a = 1;
		int b = 2;
		int c = 3;

		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	} // end main
} // end class


// Demonstrate ?
class Ternary{
	static public void main(String args[]){
		int i, k;
		
		i = 10;
		k = i < 0 ? -i : i; 
		System.out.print("Absolute value of ");
		System.out.println(i + " is " + k);

		i = -10;
		k = i < 0 ? -i : i;
		Syatem.Out.println("Absolute value of " + i + " is " + k);
	} // end main
} // end class


