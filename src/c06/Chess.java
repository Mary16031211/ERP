//: reusing/Chess.java
package c06; /* Added by Eclipse.py */
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.*;

class Game {
  Game(int i) {
    print("Game constructor i="+i);
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    super(i++);
    print("BoardGame constructor i="+i);
  }
}	

public class Chess extends BoardGame {
  Chess() {
    super(11);
    print("Chess constructor");
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
