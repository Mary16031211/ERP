package pratice.leetcode;
import java.util.*;
public class problem18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null||nums.length<4){
        	return res;
        }
        Arrays.sort(nums);   
        for(int i=0;i+3<nums.length;i++){
        	if(i>0&&nums[i]==nums[i-1])
        		continue;
        	int j=i+1,k=i+2,e=nums.length-1;
        	while(k<e){
        		
        	}
        }
        return res;
    }
}
