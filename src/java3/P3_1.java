package java3;
import java.util.Scanner;
public class P3_1{
	static int chichen,habbit; //chichen的数量， habbit兔的数量
	public static  int qiongJu(int head , int foot) {//穷举算法
		int re,i,j; 
		re=0;
	    for(i=0;i<=head;i++)						//循环
	    {
	        j=head-i;
	        if(i*2+j*4==foot)						//找到答案
	        {
	           re=1;  
			   chichen=i;
			   habbit=j;
			   break;
	        } 
	    }
	    return re;
	}
	public static void main(String[] args) {       
		int re,head,foot;
		System.out.println("穷举法求解鸡兔同笼问题:");
		System.out.print("请输入人头数：");
		Scanner input=new Scanner(System.in);
		head=input.nextInt();                     
		System.out.print("请输入脚数：");
		foot=input.nextInt();                     
		re=qiongJu(head,foot);
		if(re==1){
			System.out.println("鸡有"+chichen+"只，兔有"+habbit+"只。");
		}
		else{
			System.out.println("无法求解！");
		}
	}
}
