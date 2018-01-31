package pratice.leetcode;

public class problem14 {
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        	return "";
        int len=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
        	if(len>strs[i].length())
        		len=strs[i].length();
        }
        boolean flag=false;
        int j=0;
        while(j<len){
        	for(int i=0;i<strs.length;){
        		if(strs[i].charAt(j)==strs[0].charAt(j)){
        			i++;
        		}else{
        			flag=true;
        			break;
        		}
        	}
        	if(flag){
        		break;
        	}
        	j++;
        }
        return strs[0].substring(0, j);
    }
	public static void main(String[] args){
		String[] strs=new String[3];
		strs[0]="abc";
		strs[1]="abder";
		strs[2]="abcf";
		String res=longestCommonPrefix(strs);
		System.out.println(res);
	}
}
