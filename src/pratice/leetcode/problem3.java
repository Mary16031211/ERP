package pratice.leetcode;
import java.util.*;
public class problem3 {
	//Time complexity : O(n^3).
//	public static boolean allUnique(String s,int start,int end){
//		Set<Character> set=new HashSet<>();
//		for(int i=start;i<end;i++){
//			char c=s.charAt(i);
//			if(set.contains(c))
//				return false;
//			set.add(c);
//		}
//		return true;
//	}
//	public static int lengthOfLongestSubstring(String s) {
//		int ans=0;
//		for(int i=0;i<s.length();i++){
//			for(int j=i+1;j<=s.length();j++){
//				if(allUnique(s,i,j)) 
//					ans=Math.max(ans, j-i);
//			}
//		}
//		return ans;
//	}

	//Map实现，Map中不允许key值重复
	public static int lengthOfLongestSubstring(String s) {	
		int ans=0;
		if(s.length()==0)
			return ans;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0,j=0;j<s.length();j++){
			if(map.containsKey(s.charAt(j))){
				i=Math.max(map.get(s.charAt(j)), i);
			}
			ans=Math.max(ans, j-i+1);
			map.put(s.charAt(j), j+1);
		}
		return ans;
	}
	
	//Sliding Window
//	public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
        //当输入是pwwkew时错误
//	public static int lengthOfLongestSubstring(String s) {
//        Map<Character,Integer> map=new HashMap<>();
//        int flag=0;
//        for(int i=0;i<s.length();i++){
//        	char c=s.charAt(i);
//        	if(!map.containsKey(c)){
//        		map.put(c, flag++);
//        	}
//        }
//        return flag;
//	}
   
	public static void main(String[] args){
		String s="aussuaab";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
