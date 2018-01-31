package java3;
import java.util.Scanner;


class DATA2
{
    String key;  				//结点的关键字
    String name;
    int age;
} 

class CLType								//定义链表结构
{
    DATA2 nodeData=new DATA2();
    CLType nextNode;
    
    CLType CLAddEnd(CLType head,DATA2 nodeData)  	//在链表尾部增加结点 
    {
        CLType node,htemp;
        if((node=new CLType())==null)
        {
            System.out.print("分配内存失败！\n"); 
            return null;  							
        }
    	else
    	{
    		node.nodeData=nodeData; 				//保存数据 
    		node.nextNode=null;  				//设置结点为表尾 
    		if(head==null)  		
    		{
    			head=node;
    			return head;
    		}
    		htemp=head;
    		while(htemp.nextNode!=null) 			//查找链表的末尾 
    		{
    			htemp=htemp.nextNode;
    		}
    		htemp.nextNode=node;
    		return head;
    	}
    }

    CLType CLAddFirst(CLType head,DATA2 nodeData) 
    {
        CLType node;
        if((node=new CLType())==null)
        {
            System.out.print("分配内存失败！\n"); 
            return null; 
        }
    	else
    	{
    		node.nodeData=nodeData; 				 
    		node.nextNode=head;  					//设置为头结点
    		head=node;        						//将头引用指向新的头结点
    		return head; 
    	}
    }

    CLType CLFindNode(CLType head,String key) 		//查找结点
    {
        CLType htemp;
        htemp=head;  					//保存链表的头引用
        while(htemp!=null)      							//若结点有效，则进行查找
        {
            if(htemp.nodeData.key.compareTo(key)==0) 		//找到关键字 
    		{
                return htemp;  						//返回该结点引用 
    		}
            htemp=htemp.nextNode; 					//没找到关键字，跳至下一结点 
        }
        return null; 								//返回空引用，遍历整个链表，没有找到相同关键字的结点
    }

    CLType CLInsertNode(CLType head,String findkey,DATA2 nodeData)  	//插入结点 
    {
        CLType node,nodetemp;    
        if((node=new CLType())==null) 		//分配内存，==null时分配失败
        {
            System.out.print("分配内存失败！\n"); 
            return null;
        }
        node.nodeData=nodeData;  					//保存数据到新结点 
        nodetemp=CLFindNode(head,findkey);
        if(nodetemp!=null)  								//找到要插入的结点
        {
            node.nextNode=nodetemp.nextNode;  		//新插入的结点指向关键结点的下一结点 
            nodetemp.nextNode=node;    			//关键结点的下一结点指向新结点
        }
    	else
    	{
            System.out.print("未找到正确的插入位置！\n"); 
//            free(node);								//释放内存
        }
        return head;								//返回头引用
    }

    int CLDeleteNode(CLType head,String key)
    {
        CLType node,htemp; 						//node保存的是要删除结点的前一结点
        htemp=head; 
    	node=head;
        while(htemp!=null)
        {
            if(htemp.nodeData.key.compareTo(key)==0) 		//找到关键字 
            {
                node.nextNode=htemp.nextNode;  		//使前一结点指向当前结点的下一结点
//                free(htemp);  						//释放要删除结点的内存
                return 1;
            }
    		else
    		{
                node=htemp;  						//node指向当前结点
                htemp=htemp.nextNode; 				//htemp指向下一结点
            }
         }
         return 0;									//删除失败
    }

    int CLLength(CLType head)						//返回当前链表的长度
    {
        CLType htemp;
        int Len=0;
        htemp=head;
        while(htemp!=null)      							//遍历整个链表
        {
            Len++; 								//当前结点不为空，长度+1
            htemp=htemp.nextNode;					//当前结点指向下一结点
        }
        return Len;									//返回长度
    }

    void CLAllNode(CLType head) 					//显示所有结点 
    {
        CLType htemp;
        DATA2 nodeData;
        htemp=head;
        System.out.printf("当前链表共有%d个结点。链表所有的数据如下：\n",CLLength(head)); 
        while(htemp!=null) 								//遍历链表
        {
            nodeData=htemp.nodeData;				//获取当前结点的数据
            System.out.printf("结点(%s,%s,%d)\n",nodeData.key,nodeData.name,nodeData.age); 
            htemp=htemp.nextNode;					//当前结点处理结束，指向下一结点
        }
    }
  
}

public class P2_2 {

	public static void main(String[] args) {
		CLType node, head=null;
	    CLType CL=new CLType();
	    String key,findkey;
	    Scanner input=new Scanner(System.in);
	    
	    System.out.print("链表测试，先输入链表中的数据，格式为：关键字 姓名 年龄\n"); 
	    do
		{ 
	    	DATA2 nodeData=new DATA2();
	        nodeData.key=input.next();
	       if(nodeData.key.equals("0")) 
			{
				break; //若输入关键字 是0，则退出
			}
			else
			{
				nodeData.name=input.next();
				nodeData.age=input.nextInt();
				head=CL.CLAddEnd(head,nodeData);//在链表尾部添加结点
			}
	    }while(true);   
	    CL.CLAllNode(head); 							//显示所有结点
	 
	    System.out.printf("\n演示插入结点，输入插入位置的关键字：") ;
	    findkey=input.next();  						//输入插入位置的关键字
	    System.out.print("输入插入结点的数据(关键字 姓名 年龄):");
	    DATA2 nodeData=new DATA2();
	    nodeData.key=input.next();
	    nodeData.name=input.next();
	    nodeData.age=input.nextInt();//输入插入结点的数据 
	    head=CL.CLInsertNode(head,findkey,nodeData);		//调用插入函数
	    CL.CLAllNode(head); 							//显示所有结点

	    System.out.print("\n演示删除结点，输入要删除的关键字:");
	     
	    key=input.next();								//输入删除结点关键字
	    CL.CLDeleteNode(head,key); 					//调用删除结点函数
	    CL.CLAllNode(head); 							//显示所有结点   

	    System.out.printf("\n演示在链表中查找，输入查找关键字:");
	    key=input.next();							//输入查找关键字 
	    node=CL.CLFindNode(head,key);					//调用查找函数
	    if(node!=null)									//若返回结点引用有效 
	    {
	        nodeData=node.nodeData;				//获取结点的数据
	        System.out.printf("关键字%s对应的结点为(%s,%s,%d)\n" ,key,nodeData.key,nodeData.name,nodeData.age);        
	    }
		else										//若结点引用无效 
		{
	        System.out.printf("在链表中未找到关键字为%s的结点！\n",key); 
		}

	}

}
