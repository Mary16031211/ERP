package pratice.leetcode;
import java.util.*;
public class problem13 {
	public static int romanToInt(String s) {
		if(s==null||s.length()==0){
			return 0;
		}
        Map<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len=s.length();
        int result=map.get(s.charAt(len-1));
        int pivort=result;
        for(int i=len-2;i>=0;i--){
        	int curr=map.get(s.charAt(i));
        	if(curr>=pivort){
        		result+=curr;
        	}else{
        		result-=curr;
        	}
        	pivort=curr;
        }
        return result;
    }
	public static void main(String[] args){
		String romeNumber="XXVII";
		int res=romanToInt(romeNumber);
		System.out.println(res);
	}
}
