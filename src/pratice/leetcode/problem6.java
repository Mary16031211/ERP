package pratice.leetcode;
import java.util.*;
public class problem6 {
	public static String convert(String s, int numRows) {
        if(s==null||s.length()==0||numRows<=0){
        	return "";
        }
        if(numRows==1)
        	return s;
        StringBuilder res=new StringBuilder();
        int size=2*numRows-2;
        for(int i=0;i<numRows;i++){
        	for(int j=i;j<s.length();j+=size){
        		res.append(s.charAt(j));
        		if(i!=0&&i!=numRows-1){
        			int tmp=j+size-2*i;
        			if(tmp<s.length())
        				res.append(s.charAt(tmp));
        		}
        	}
        }
        return res.toString();
    }
	public static void main(String[] args){
		String s1="A";
		String s2="PAYPALISHIRING";
		System.out.println(convert(s1,1));
		System.out.println(convert(s2,3));
		System.out.println(convert(s2,0));
	}
}
