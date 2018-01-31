package pratice.leetcode;

public class problem7 {
	public static long reverse(int x) {
		long result=0;
        while(true){
        	int n=x%10;
        	result=result*10+(long)n;
        	x=x/10;
        	if(x==0){
        		break;
        	}
        }
        return result;
    }
	public static void main(String[] args){
		int x=1534236469;
		int y=-4560;
		System.out.println();
		System.out.println(reverse(1534236469));
		System.out.println(reverse(y));
	}
}
