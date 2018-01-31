package pratice.leetcode;
class NodeList {
    int val;     
    NodeList next;
	NodeList(int x) { 
		val = x; 
	}
}
public class problem21 {
	public static NodeList mergeTwoLists(NodeList l1, NodeList l2) {
		NodeList L=new NodeList(-1);
        NodeList pre=L;
        while((l1!=null)&&(l2!=null)){
            if(l1.val<=l2.val){
                L.next=new NodeList(l1.val);
                l1=l1.next;
            }else{
                L.next=new NodeList(l2.val);
                l2=l2.next;
            }
            L=L.next;
        }
        L.next= l1==null?l2:l1;
        return pre.next;
    }
	public static void main(String[] args){
		NodeList l1=new NodeList(1);
		l1.next=new NodeList(4);
		l1.next.next=new NodeList(6);
		NodeList l2=new NodeList(1);
		l2.next=new NodeList(2);
		l2.next.next=new NodeList(5);
		NodeList L=mergeTwoLists(l1,l2);
		while(L!=null){
			if(L.next!=null){
				System.out.print(L.val+"->");
			}else{
				System.out.print(L.val);
			}
			L=L.next;
		}
	}
}