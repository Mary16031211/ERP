package pratice.leetcode;

import java.util.*;

public class problem20 {
	public static boolean isValid(String s) {
		if(s==null||s.length()==0)
			return true;
        Stack<Character> stack=new Stack();
        Map<Character,Character> map=new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
        		stack.push(s.charAt(i));
        	}else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
        		char c=map.get(s.charAt(i));
        		if(stack.empty()){
        			return false;
        		}else{
        			if(stack.pop()!=c){
        				return false;
        			}
        		}
        	}
        }
        if(!stack.empty()){
        	return false;
        }
        return true;
    }
	public static void main(String[] args){
		System.out.println(isValid("]"));
	}
}
