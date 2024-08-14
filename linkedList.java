package Practice;

public class linkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			next=null;
		} 
	}
	
	void print(Node head) {
		while(head!=null) {
			System.out.println(head.data+ " ");
			head=head.next;
		}
		System.out.println();
	}
	
	Node reverse(Node head) {
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}
	 public static void main(String[] args) {
		
		 linkedList ll =new linkedList();
		 ll.head = new Node(85);
		 ll.head.next=new Node(10);
		 ll.head.next.next = new Node(15);
		 ll.head.next.next.next=new Node(20);
		 
		 ll.print(head);
		 head= ll.reverse(head);
		 ll.print(head);
	}

}
