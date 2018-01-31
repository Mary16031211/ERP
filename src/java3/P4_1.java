package java3;
//冒泡排序，对n个数排序，需要n-1步的中间排序，改进：加入判断可以加速算法的执行过程
public class P4_1 {
	static final int SIZE=10;
	public static void bubbleSort(int[] a) {
		 int temp;
		 for (int i = 1; i < a.length; i++) {
			 boolean flag=false;
        	  for (int j = 0; j < a.length - i; j++) {
        		  if (a[j] > a[j + 1]) {//将两个相邻的数进行比较，较大的往后移
        			  temp=a[j];
        			  a[j]=a[j+1];
        			  a[j+1]=temp;
        			  flag=true;
        		  }
        	  }
        	  if(flag){ //加入判断，当数组不再进行交换了，表示排序已经完成，跳出循环
        		  System.out.print("第"+i+"步排序结果:");//输出每步排序结果
        		  for(int k=0;k<a.length;k++)
        		  {
        			  System.out.print(" "+a[k]); //输出
        		  }
        		  System.out.print("\n"); 
        	  }else{
        		  break;
        	  }
		 }
	 } 

	public static void main(String[] args) {
		int[] shuzu=new int[SIZE];
		int i;
		for(i=0;i<SIZE;i++)
		{
			shuzu[i]=(int)(100+Math.random()*(100+1));//初始化数据
		}
		System.out.print("排序前的数组：\n");	
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");
		}
		System.out.print("\n");
		bubbleSort(shuzu);		//排序操作
		System.out.print("排序后的数组为：\n");
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");//输出排序后的数组
		}
		System.out.print("\n");

	}

}
