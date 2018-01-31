package pratice.leetcode;

public class problem2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead=new ListNode(0);
        ListNode p=l1,q=l2,curr=resultHead;
        int carry=0;
        while((p!=null)||(q!=null)){
        	int x=(p!=null)?p.val:0;
        	int y=(q!=null)?q.val:0;
        	int sum=carry+x+y;
        	carry=sum/10;
        	curr.next=new ListNode(sum%10);
        	//很重要的移动
        	curr=curr.next;
        	if (p!=null) p=p.next;
        	if (q!=null) q=q.next;
        }
        if(carry>0){
        	curr.next=new ListNode(carry);
        }
        return resultHead.next;
    }
	public static void main(String[] args){
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode res=addTwoNumbers(l1,l2);
		while(res!=null){
			System.out.print(res.val+",");
			res=res.next;
		}
	}
}