package pratice.leetcode;

public class problem38 {
	public static String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
        	int count=1;
        	String temp="";
        	for(int j=1;j<s.length();j++){
        		if(s.charAt(j)==s.charAt(j-1))
        			count++;
        		else{
        			temp=temp+(char)(count+'0')+s.charAt(j-1);
        			count=1;
        		}
        	}
        	s=temp+(char)(count+'0')+s.charAt(s.length()-1);
        }
        return s;
    }
	//结果不正确！！！！！
	public static String vount(int n){
		String s="1";
		for(int i=1;i<n;++i){
			String temp="";
			for(int j=0,count;j<s.length();++j){
				for(count=1;j<s.length()-1&&s.charAt(j)==s.charAt(j+1);++j,++count){
					temp=temp+(char)(count+'0')+s.charAt(j);
				}
				s=temp;
			}
		}
		return s;
	}
	public static void main(String[] args){
		for(int i=1;i<=15;i++)
			System.out.println(vount(i));
	}
}
