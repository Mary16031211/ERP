package pratice.leetcode;

import java.util.Arrays;

public class problem16 {
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i+2<nums.length;i++){
        	if(i>0&&nums[i]==nums[i-1])
        		continue;
        	int j=i+1,k=nums.length-1;
        	while(j<k){
        		int sum=nums[i]+nums[j]+nums[k];
        		if(sum>target)
        			k--;
        		else
        			j++;
        		if(Math.abs(sum-target)<Math.abs(diff-target))
        			diff=sum;
        	}
        }
        return diff;
    }
	public static void main(String[] args){
		int[] nums={0,1,2};
		System.out.print(threeSumClosest(nums,3));
	}
}
