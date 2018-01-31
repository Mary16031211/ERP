//String to Integer
/*
 * 该函数首先丢弃尽可能多的空白字符，直到找到第一个非空白字符。 然后，从这个字符开始，采用一个可选的初始加号或减号，后面跟随尽可能多的数字，并将其解释为一个数字值。
 * 该字符串可以包含附加字符后面的那些形成整数的数字，这些字符被忽略，对这个函数的行为没有影响。
 * 如果str中的第一个非空白字符序列不是有效的整数，或者如果由于str为空或仅包含空格字符而不存在这样的序列，则不执行转换。
 * 如果不能执行有效的转换，则返回零值。 如果正确值超出了可表示值的范围，则返回INT_MAX（2147483647）或INT_MIN（-2147483648）。
 */
package pratice.leetcode;
import java.util.regex.*;
public class problem8 {
	public static int myAtoi(String str) {
		int a=0;
		//1、null or empty string
		if(str==null||str.length()==0)
			return 0;
		//2、whitespaces
		str=str.trim();
		//3、+/- sign
		boolean positive=true;
		int i=0;
		if(str.charAt(0)=='+'){
			i++;
		}else if(str.charAt(0)=='-'){
			positive=false;
			i++;
		}
		//4、calculate real value
		double tmp=0;
		for(;i<str.length();i++){
			int digit=str.charAt(i)-'0';
			if(digit<0||digit>9)
				break;
			//5、handle min & max
			if(positive){
				tmp=10*tmp+digit;
				if(tmp>Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			}else{
				tmp=10*tmp-digit;
				if(tmp<Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
		}
		int ret=(int)tmp;
		return ret;
    }
	public static boolean isNumber(String str){
		int len=str.length();
		if(!Character.isDigit(str.charAt(0))){
			if(str.charAt(0)!='-')
				return false;
		}
		for(int i=1;i<len;i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String str="2147483648";
		int a=Integer.parseInt("123");
		double b=Double.parseDouble(str);
		System.out.println(myAtoi(str));
		System.out.println(Integer.MAX_VALUE+","+Integer.MIN_VALUE);		
	}
}
