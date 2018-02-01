package test_jdk;
import java.util.*;
/**
 * @author MLN
 * @version time: 2018年2月1日 上午10:19:13
 */
public class MathTest {
	public static void main(String[] args){
		//static fields
		print("1 e=",Math.E);
		print("2 PI=",Math.PI);
		
		//method
		print("3 abs",Math.abs(-2.69));
		print("4 acos",Math.acos(0.5));
		print("5 addExact",Math.addExact(99999999, 999999999));
	}
	public static void print(String index,Object ob){
		System.out.println("{"+index+"}:"+ob);
	}
}
