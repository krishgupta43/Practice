package Practice;

public class demo {
	static Node head;
	static class Node{
		int data; 
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		} 
	}
	
	static void PrintList(Node head) {
		while(head!=null) {
			System.out.println(head.data +" ");
			head=head.next;
		}
	}
	static Node Reverse(Node head) {
		if(head==null || head.next==null)return head;
		Node res=Reverse(head.next);
		head.next.next=head;
		head.next=null;
		return res;
	}
	
 public static void main(String[] args) {
	demo ll=new demo();
	ll.head=new Node(20);
	ll.head.next=new Node(30);
	ll.head.next.next=new Node(40);
	ll.head.next.next.next=new Node(50);
	ll.head.next.next.next.next=new Node(60);
	
	
	
	ll.PrintList(head);
	head=Reverse(head);
	System.out.println();
	ll.PrintList(head);	
}
}
