package java3;
public class P4_5 {
	static final int SIZE=8;
	static int x=0;
	static void quickSort(int[] arr,int left,int right)			//快速排序
	{
	    int f,t;
		int rtemp,ltemp;

	    ltemp=left;
	    rtemp=right;
	    f=arr[(left+right)/2];						//分界值
	    while(ltemp<rtemp){
	    	while(arr[ltemp]<f){
	    		ltemp++;
	    	}
	    	while(arr[rtemp]>f){
	    		rtemp--;
	    	}
	    	if(ltemp<=rtemp){
	    		t=arr[ltemp];
	    		arr[ltemp]=arr[rtemp];
	    		arr[rtemp]=t;
	    		rtemp--;
	    		ltemp++;
	    	}
	    }
	    if(ltemp==rtemp){
	    	ltemp+=1;
	    }
	    if(ltemp<right){
	    	quickSort(arr,rtemp+1,right);
	    }
	    if(left<rtemp){
	    	quickSort(arr,left,ltemp-1);
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
		
		quickSort(shuzu,0,SIZE-1);
		
		System.out.print("排序后的数组：\n");
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");					
		}
		System.out.print("\n");

	}

}
