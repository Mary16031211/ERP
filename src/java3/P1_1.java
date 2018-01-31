package java3;
import java.util.*;
public class P1_1 {
	static int N=20;
	public static void main(String[] args){
		int[] arr=new int[N];
		int x,n,i;
		int f=-1;
		Random r=new Random();
		for(i=0;i<N;i++){
			arr[i]=r.nextInt(100);
		}
		System.out.println("随机生成的数据序列：");
		for(i=0;i<N;i++)
			System.out.print(arr[i]+",");
		System.out.println();
		System.out.print("输入要查找的数：");
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		for(i=0;i<N;i++){
			if(x==arr[i]){
				f=i;
				break;
			}
		}
		if(f<0)
			System.out.println("没找到数");
		else{
			System.out.println(x+"位于第"+(f+1)+"位");
		}
	}
}
