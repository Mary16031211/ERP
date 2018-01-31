package niuke;
import java.util.*;
public class Gamerenwu {

		static long[] ar = new long[32]; //定义long型，但只用前32位，java没有unsigned int怪我喽
		public static int Find(int change,int find){
			if(change>=1024||find>=1024) return -1;
			//将1024个任务的状态平均分给32个变量，每个变量恰好可以表示32个任务（32位，一位一个），刚好满足题意
			int ch_b = change/32; //计算要完成的任务在哪一个变量
			int ch_s = change-ch_b*32; //计算要完成的任务在该变量的哪一位
		
			int f_b = find/32;//计算要查找的任务在哪一个变量
			int f_s = find-f_b*32;//计算要查找的任务在该变量的哪一位
		
			ar[ch_b] = ar[ch_b]|(long)Math.pow(2, ch_s);//通过或运算把表示要完成任务的那一位置为1

			if( (ar[f_b]|(long)Math.pow(2, f_s)) ==(long)Math.pow(2, f_s) ) //通过或运算来确定表示要查找的任务的那一位是否为1，long型问题同上
				return 1;
			else 
				return 0;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
				int change = sc.nextInt()-1;
				int find = sc.nextInt()-1;
				System.out.println(Find(change,find));
		}
		
}
