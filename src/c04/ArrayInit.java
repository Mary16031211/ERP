//: initialization/ArrayInit.java
package c04; /* Added by Eclipse.py */
// Array initialization.
import java.util.*;

public class ArrayInit {
  public static void main(String[] args) {
    Integer[] a = {
      new Integer(1),
      new Integer(2),
      3, // Autoboxing
    };
    Integer[] b = new Integer[]{
      new Integer(4),
      new Integer(5),
      3, // Autoboxing
    };
    System.out.println(a[0]+","+a[1]+","+a[2]);
    System.out.println(b[0]+","+b[1]+","+b[2]);
  }
} /* Output:
[1, 2, 3]
[1, 2, 3]
*///:~
