package pratice.leetcode;
import java.util.*;
public class problem15 {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i+2<nums.length;i++){
        	if(i>0&&nums[i]==nums[i-1]){
        		continue;
        	}
        	int j=i+1,k=nums.length-1;
        	int target=-nums[i];
        	while(j<k){
        		if(nums[j]+nums[k]==target){
        			res.add(Arrays.asList(nums[i],nums[j],nums[k]));
        			j++;
        			k--;
        			while(j<k&&nums[j]==nums[j-1]) j++;
        			while(j<k&&nums[k]==nums[k+1]) k--;
        		}else if(nums[j]+nums[k]>target){
        			k--;
        		}else{
        			j++;
        		}
        	}
        }
        return res;
    }
	public static void main(String[] args){
		int[] nums={-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res=threeSum(nums);
		for(int i=0;i<res.size();i++){
			for(int j=0;j<res.get(i).size();j++)
				System.out.print(res.get(i).get(j)+" ");
			System.out.println();
		}
	}
}
