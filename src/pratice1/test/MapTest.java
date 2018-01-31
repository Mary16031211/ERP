package pratice1.test;
import java.util.*;
public class MapTest {
	public static void main(String[] args){
		Map<Character,Integer> map=new HashMap<>();
		map.put('w', 2);
		map.put('w', 3);
		System.out.print(map.get('w'));
		
	}
}
