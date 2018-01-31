package pratice.leetcode;

public class problem19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp=head;
        int length=0;
        while(tmp!=null){
        	length++;
        	tmp=tmp.next;
        }
        if(n>length){
        	return null;
        }
//        if(n==1&&length==1)
//        	return null;
        if(length==n){     //特殊情况
        	head=head.next;
        	return head;
        }
        tmp=head;
        for(int i=1;i<length-n;i++){
        	tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
        return head;
    }
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		ListNode tmp=head;
//		for(int i=2;i<=2;i++){
//			tmp.next=new ListNode(i);
//			tmp=tmp.next;
//		}
		problem19 p_19=new problem19();
		tmp=p_19.removeNthFromEnd(head, 1);
		while(tmp!=null){
			System.out.print(tmp.val+" ");
			tmp=tmp.next;
		}
	}
}
