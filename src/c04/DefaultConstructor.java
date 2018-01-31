//: initialization/DefaultConstructor.java
package c04; /* Added by Eclipse.py */

class Bird {int i;}
class Bush{
	 Bush(int i) {}
	 Bush(double d) {}
}

public class DefaultConstructor {
  public static void main(String[] args) {
    Bird b = new Bird(); // Default!
    Bush sh=new Bush(1);
  }
} ///:~
