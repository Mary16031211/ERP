package pratice.leetcode;
import java.util.*;
public class problem17 {
    private static final String[] mapping=new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	 public List<String> letterCombinations(String digits) {
	    List<String> res=new ArrayList<>(); 
	    if(digits==null||digits.length()==0)//考虑全面
	    	return res;
	    combination("",digits,0,res);
	    return res;
	 }
	 public void combination(String cur,String digits,int offset,List<String> res){
		 if(cur.length()==digits.length()){
			 res.add(cur);
			 return;
		 }
		 String letters=mapping[(digits.charAt(offset)-'0')];
		 for(int i=0;i<letters.length();i++){
			 combination(cur+letters.charAt(i),digits,offset+1,res);
		 }
	 }
	 public static void main(String[] args){
		 problem17 p17=new problem17();
		 String digits="23";
		 List<String> res=p17.letterCombinations(digits);
		 for(int i=0;i<res.size();i++){
			 System.out.println(res.get(i));
		 }
	 }
}
