package pratice.leetcode;

public class problem11 {
	//时间超时
//	public static int maxArea(int[] height) {
//        int n=height.length,MaxArea=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                MaxArea=Math.max(MaxArea,Math.min(height[i],height[j])*(j-i));
//            }
//        }
//        return MaxArea;
//    }
	public static int maxArea(int[] height){
		int l=0,r=height.length-1;
		int maxArea=0;
		while(l<r){
			maxArea=Math.max(maxArea, Math.min(height[l], height[r])*(r-l));
			if(height[l]<height[r]){
				l++;
			}else{
				r--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args){
		int[] height={123,1456,76454};
		int maxArea=maxArea(height);
		System.out.print(maxArea);
	}
}
