package pratice.leetcode;

public class problem4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        if(m>n){
        	int[] tmp=nums1;
        	nums1=nums2;
        	nums2=tmp;
        	int t=m;
        	m=n;
        	n=t;
        }
        int iMin=0,iMax=m,halfLen=(m+n+1)/2;
        while(iMin<=iMax){
        	int i=(iMin+iMax)/2;
        	int j=halfLen-i;
        	if(i<iMax&&nums2[j-1]>nums1[i]){
        		iMin++;
        	}else if(i>iMin&&nums1[i-1]>nums2[j]){
        		iMax--;
        	}else{
        		int maxLeft=0;
        		if(i==0){
        			maxLeft=nums2[j-1];
        		}else if(j==0){
        			maxLeft=nums1[i-1];
        		}else{
        			maxLeft=Math.max(nums1[i-1], nums2[j-1]);
        		}
        		if((m+n)%2==1){
        			return maxLeft;
        		}
        		int minRight=0;
        		if(i==m){
        			minRight=nums2[j];
        		}else if(j==n){
        			minRight=nums1[i];
        		}else{
        			minRight=Math.min(nums2[j], nums1[i]);
        		}
        		return (maxLeft+minRight)/2.0;
        	}
        }
        return 0.0;
    }
	//普通方法
	public static double findMid(int[] A,int[] B){
		int m=A.length,n=B.length;
		if(m==0&&n!=0){
			if(n%2==1){
				return B[n/2];
			}else{
				return (B[n/2]+B[n/2-1])/2.0;
			}
		}else if(m!=0&&n==0){
			if(m%2==1){
				return B[m/2];
			}else{
				return (A[m/2]+A[m/2-1])/2.0;
			}
		}else{
			int[] com=combine(A,B);
			if(com.length%2==1){
				return com[com.length/2];
			}else{
				return (com[com.length/2]+com[com.length/2-1])/2.0;
			}
		}
	}
	//将两个有序数组合并成一个有序数组
	public static int[] combine(int[] A,int[] B){
		int tol=A.length+B.length;
		int[] fin=new int[tol];
		int flag=0,i=0,j=0;
		for(;i<A.length&&j<B.length;){
			if(A[i]<B[j]){
				fin[flag]=A[i];
				flag++;
				i++;
			}else if(A[i]>B[j]){
				fin[flag]=B[j];
				flag++;
				j++;
			}
		}
		for(;i<A.length;){
			fin[flag]=A[i];
			flag++;
			i++;
		}
		for(;j<B.length;){
			fin[flag]=B[j];
			flag++;
			j++;
		}
		return fin;
	}
	public static void main(String[] args){
		int[] nums1={1,3,5};
		int[] nums2={4,6,9};
		System.out.println(findMedianSortedArrays(nums1,nums2));
		System.out.println(findMid(nums1,nums2));
	}
}
