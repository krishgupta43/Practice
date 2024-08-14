package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
	Node left;
	Node right;
	int data;
 
	Node(int d) {
		data = d;
		left = null;
		right = null;
 
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		levelOrder(root);
		
		System.out.println(root);
		
	}



	private static void levelOrder(Node root) {
	  Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.println(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}
}