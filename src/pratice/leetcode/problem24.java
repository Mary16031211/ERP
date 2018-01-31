package pratice.leetcode;

public class problem24 {
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null)
			return head;
		ListNode first=head,second=head.next;
		first.next=swapPairs(second.next);
		second.next=first;
		return second;
    }
	public static void main(String[] args){
		problem24 P24=new problem24();
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		ListNode tmp=head;
		while(tmp!=null){
			System.out.print(tmp.val+" ");
			tmp=tmp.next;
			
		}
		System.out.println();
		ListNode res=P24.swapPairs(head);
		while(res!=null){
			System.out.print(res.val+" ");
			res=res.next;
		}
	}
}
