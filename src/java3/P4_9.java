package java3;
public class P4_9 {
	static final int N=5;
	static void quickSort(String[] arr,int left,int right)//对字符串快速排序算法			
	{
	    String  f,t;
		int rtemp,ltemp;
		
		ltemp=left;
		rtemp=right;
		f=arr[(left+right)/2];
		while(ltemp<rtemp){
			while(arr[ltemp].compareTo(f)<0){
				ltemp++;
			}
			while(arr[rtemp].compareTo(f)>0){
				rtemp--;
			}
			if(ltemp<=rtemp){
				t=arr[ltemp];
				arr[ltemp]=arr[rtemp];
				arr[rtemp]=t;
				ltemp++;
				rtemp--;
			}
		}
		if(ltemp==rtemp){
			ltemp++;
		}
		if(left<rtemp){
			quickSort(arr,left,ltemp-1);
		}
		if(ltemp<right){
			quickSort(arr,rtemp+1,right);
		}
	}
	public static void main(String[] args) 
	{
		String[] arr=new String[]{"One","World","Dream","Beijing","Olympic"};
		int i;

		System.out.print("排序前：\n");
		for(i=0;i<N;i++)
		{
			System.out.println(arr[i]);					
		}

		quickSort(arr,0,N-1);							

		System.out.print("排序后：\n");
		for(i=0;i<N;i++)
		{
			System.out.println(arr[i]);					
		}
		

	}
}


