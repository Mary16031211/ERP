package java3;
import java.util.*;
//结点的关键字
class DATA{
	String key;
	String name;
	int age;
}
//定义顺序表结构
class SLType{
	static final int MAXLEN=100;
	DATA[]  ListData=new DATA[MAXLEN+1];
	int ListLen;
	//初始化顺序表
	void SLInit(SLType SL){
		SL.ListLen=0;//初始化为空表
	}
	//返回顺序表的长度
	int SLLength(SLType SL){
		return SL.ListLen;
	}
	//插入元素到序号n
	boolean SLInsert(SLType SL,int n,DATA data){
		int i;
		if(SL.ListLen>=MAXLEN){//顺序表已满
			System.out.print("顺序表已满，不能插入结点！\n");
			return false;
		}
		if(n<1||n>SL.ListLen){//插入结点序号有误
			System.out.print("插入序号有误！\n");
			return false;
		}
		for(i=SL.ListLen;i>=n;i--){
			SL.ListData[i+1]=SL.ListData[i];
		}
		SL.ListData[n]=data;
		SL.ListLen++;
		return false;
	}
	//删除顺序表中的元素
	boolean SLDelete(SLType SL,int n){
		int i;
		if(n<1||n>SL.ListLen+1){
			System.out.print("删除结点序号有误！\n");
			return false;
		}
		for(i=n;i<SL.ListLen;i++){
			SL.ListData[i]=SL.ListData[i+1];
		}
		SL.ListLen--;
		return true;
	}
	//根据序号返回数据元素
	DATA SLFindByNum(SLType SL,int n){
		if(n<1||n>SL.ListLen+1){
			System.out.print("序号有误！\n");
			return null;
		}
		return SL.ListData[n];
	}
	//按关键字查询结点
	int SLFindByCont(SLType SL,String key){
		int i;
		for(i=1;i<=SL.ListLen;i++){
			if(SL.ListData[i].key.compareTo(key)==0){
				return i;
			}
		}
		return -1;//没有找到返回-1
	}
	//显示顺序表中的所有结点
	void SLAll(SLType SL){
		int i;
		for(i=1;i<=SL.ListLen;i++){
			System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,SL.ListData[i].age);
		}
	}
	boolean SLAdd(SLType SL,DATA data){
		if(SL.ListLen>=MAXLEN){
			System.out.print("顺序表已满，添加失败！\n");
			return false;
		}
		SL.ListData[++SL.ListLen]=data;
		return true;
	}
}
public class P2_1 {
	public static void main(String[] args){
		int i;
		SLType SL=new SLType();
		DATA pdata;
		String key;
		System.out.println("顺序表操作演示！");
		SL.SLInit(SL);
		System.out.print("初始化顺序表完成！\n");
		Scanner input=new Scanner(System.in);
		do{
			System.out.print("输入添加的结点（学号 姓名 年龄）：");
			DATA data=new DATA();  
	        data.key=input.next();
	        data.name=input.next();
	        data.age=input.nextInt();
	        
	        if(data.age!=0)               //若年龄不为0 
	        {
	            if(!SL.SLAdd(SL,data))   //若添加结点失败 
				{
	                break;            //退出死循环 
				}
	        }
		   else   				//若年龄为0 
		   {
	            break;          		//退出死循环
		   }
	    }while(true);
		System.out.print("\n顺序表中的结点顺序为：\n");
	    SL.SLAll(SL);                  //显示所有结点数据 
	    
	    
	    System.out.print("\n要取出结点的序号：");
	    i=input.nextInt();               //输入结占点序号    
	    pdata=SL.SLFindByNum(SL,i);  //按序号查找结点 
	    if(pdata!=null)        			//若返回的结点指针不为NULL
		{ 
	        System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);
		}
	    
	   
	    System.out.print("\n要查找结点的关键字：");
	    key=input.next();  			//输入关键字     
	    i=SL.SLFindByCont(SL,key);     //按关键字查找 ，返回结点序号 
	    pdata=SL.SLFindByNum(SL,i);   //按序号查询，返回结点指针 
	    if(pdata!=null)                     //若结点指针不为NULL 
		{
	        System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);  
		}
	}
}
