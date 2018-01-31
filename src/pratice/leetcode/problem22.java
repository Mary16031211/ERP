package pratice.leetcode;
import java.util.*;
public class problem22 {
	//O(​4​n/√​n​)
	public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
    	System.out.println(cur+",open="+open+",close="+close+",max="+max);
    	if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        
        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);//open是加1，不是自增！
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
    public static void main(String[] args){
    	problem22 pro=new problem22();
    	List<String> res=pro.generateParenthesis(3);
    	for(int i=0;i<res.size();i++){
    		System.out.print(res.get(i));
    		System.out.println();
    	}
    }
}
