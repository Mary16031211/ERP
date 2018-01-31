package java3;
//插入排序算法，对n个数据排序，需要进行n-1步排序，当数据有序时效率较好，数据无规则时，需要移动大量的数据
public class P4_3 
{
	static final int SIZE=10;
	static void insertionSort(int[] a)
	{
	    int i,j,t,h;
	    for (i=1;i<a.length;i++)
	    {
			t=a[i];
			j=i-1;
			while(j>=0 && t<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;

			System.out.print("第"+i+"步排序结果:");
			for(h=0;h<a.length;h++)
			{
				System.out.print(" "+a[h]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) 
	{
		int[] shuzu=new int[SIZE];
		int i;
		
		for(i=0;i<SIZE;i++)
		{
			shuzu[i]=(int)(100+Math.random()*(100+1));
		}
		System.out.print("排序前的数组：\n");
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");
		}
		System.out.print("\n");
		
		insertionSort(shuzu);					
		
		System.out.print("排序后的数组：\n");
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");					
		}
		System.out.print("\n");

	}

}
