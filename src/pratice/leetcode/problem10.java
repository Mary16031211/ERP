package pratice.leetcode;
/*未理解！！！！
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * The function prototype should be 
 * boolean isMatch(const char *s, const char *p)
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */
public class problem10 {
	public static boolean isMatch(String s, String p) {
        if(p.isEmpty())
        	return s.isEmpty();
        boolean first_match=(!s.isEmpty())&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        if(p.length()>=2&&p.charAt(1)=='*')
        	return isMatch(s,p.substring(2))||(first_match && isMatch(s.substring(1), p));
        else{
        	return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
	public static void main(String[] args){
		String s="aab";
		String p="c*a*b";
		System.out.print(isMatch(s,p));
	}
}
