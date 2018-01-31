package pratice.leetcode;

public class problem9 {
	public static boolean isPalindrome(int x){
		if(x<0||(x%10==0&&x!=0)){
			return false;
		}
		int reserverNumber=0;
		while(x>reserverNumber){
			reserverNumber=reserverNumber*10+x%10;
			x=x/10;
		}
		System.out.println("reserverNumber:"+reserverNumber+",x:"+x);
		return x==reserverNumber||x==reserverNumber/10;
	}
	public static void main(String[] args){
		System.out.print(isPalindrome(12456));
	}
}
