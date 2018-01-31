package pratice.leetcode;
import java.util.*;
public class problem1 {
	//复杂度O(n^2)
	public static int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
        	result[0]=i;
        	int flag=0;
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]+nums[j]==target){
        			result[1]=j;
        			flag=1;
        			break;
        		}
        	}
        	if(flag==1){
        		break;
        	}
        }
        return result;
    }
	//Two-pass Hash Table 复杂度O(n)
	public static int[] twoSum1(int[] nums,int target){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], i);	
		}
		for(int i=0;i<nums.length;i++){
			int complement=target-nums[i];
			if(map.containsKey(complement)&&map.get(complement)!=i){
				return new int[]{i,map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution!");
	}
	public static void main(String[] args){
		int[] nums={2,7,11,15};
		int[] result=twoSum1(nums,17);
		System.out.println("["+result[0]+","+result[1]+"]");
	}
}
