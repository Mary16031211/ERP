//: initialization/PrimitiveOverloading.java
package c04; /* Added by Eclipse.py */
// Promotion of primitives and overloading.

public class PrimitiveOverloading {
	// boolean can't be automatically converted
	static void prt(String s) {
		System.out.println(s);
	}
	void f1(char x) { prt("f1(char) "); }
	void f1(byte x) { prt("f1(byte) "); }
	void f1(short x) { prt("f1(short) "); }
	void f1(int x) { prt("f1(int) "); }
	void f1(long x) { prt("f1(long) "); }
	void f1(float x) { prt("f1(float) "); }
	void f1(double x) { prt("f1(double) "); }

	void f2(byte x) { prt("f2(byte) "); }
	void f2(short x) { prt("f2(short) "); }
	void f2(int x) { prt("f2(int) "); }
	void f2(long x) { prt("f2(long) "); }
	void f2(float x) { prt("f2(float) "); }
	void f2(double x) { prt("f2(double) "); }

	void f3(short x) { prt("f3(short) "); }
	void f3(int x) { prt("f3(int) "); }
	void f3(long x) { prt("f3(long) "); }
	void f3(float x) { prt("f3(float) "); }
	void f3(double x) { prt("f3(double) "); }

	void f4(int x) { prt("f4(int) "); }
	void f4(long x) { prt("f4(long) "); }
	void f4(float x) { prt("f4(float) "); }
	void f4(double x) { prt("f4(double) "); }

	void f5(long x) { prt("f5(long) "); }
	void f5(float x) { prt("f5(float) "); }
	void f5(double x) { prt("f5(double) "); }

	void f6(float x) { prt("f6(float) "); }
	void f6(double x) { prt("f6(double) "); }

	void f7(double x) { prt("f7(double) "); }

	void testConstVal() {
		prt("5: ");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5); 
	}
	void testChar() {
		char x = 'x';
		prt("char: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testByte() {
		byte x = 0;
		prt("byte: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testShort() {
		short x = 0;
		prt("short: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testInt() {
		int x = 0;
		prt("int: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testLong() {
		long x = 0;
		prt("long: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testFloat() {
		float x = 0;
		prt("float: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	void testDouble() {
		double x = 0;
		prt("double: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); 
	}
	public static void main(String[] args) {
		PrimitiveOverloading p =
				new PrimitiveOverloading();
		p.testConstVal();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
	}
} /* Output:
5: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
char: f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
byte: f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double)
short: f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double)
int: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
long: f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double)
float: f1(float) f2(float) f3(float) f4(float) f5(float) f6(float) f7(double)
double: f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double)
*///:~
