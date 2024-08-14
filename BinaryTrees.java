package Practice;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTrees {
	static Node root;
	static class Node {
		Node left;
		Node right;
		int data;
	 
		Node(int d) {
			this.data = d;
			left = null;
			right = null;
	 
		}
	}
  
	void levelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) 
				q.add(temp.left);
			if (temp.right!=null)
				q.add(temp.right);
		}
	}
	
	
	static int SizeBt(Node root) {
	   if(root==null)return 0;
		else {
			Queue<Node>q=new LinkedList<Node>();
			q.add(root);
			int size=0;
			while(!q.isEmpty()) {
				Node temp=q.remove();
				size++;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
			return size;
		}
	}
	
   int height(Node root) {
	   if(root==null)return 0;
	   Queue<Node>q=new LinkedList<Node>();
	   q.add(root);
	   int size=0;
       int height=0;
	   while(!q.isEmpty()) {
		   size=q.size();
		   while(size>0) {
			   Node temp=q.poll();
			   if(temp.left!=null)
				   q.add(temp.left);
			   if(temp.right!=null)
				   q.add(temp.right);
			   size--;
		   }
		   height++;
	   }
	   return height;
	   
   }
   
   int leafNode(Node root) {
	   if(root==null)return 0;
	   if(root.left==null && root.right==null)
		   return 1;
	   else
		   return leafNode(root.left)+leafNode(root.right);
   }

	
   public static void main(String[] args) {
		BinaryTrees tree= new BinaryTrees();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
		tree.root.right.right=new Node(5);
		
		
		int res=SizeBt(root);
		System.out.println("Size of the tree :");
		System.out.print(res);
		
		System.out.println("\nlevel order of the tree :");
		tree.levelOrder();
		System.out.println();
		
		System.out.println("\nHeight of the tree :");
		System.out.println(tree.height(root));
		
		System.out.println("\nCount Leaf Node of the tree :");
		System.out.println(tree.leafNode(root));
		
		List<Integer>li=TopView(root);
		System.out.println(li);
		
		
	}


	private static List<Integer> TopView(Node root) {
		// TODO Auto-generated method stub
		List<Integer>ans=new ArrayList<>();
		if(root==null)return ans;
		
		Queue<java.util.Map.Entry<Node, Integer>> q = new LinkedList<>();
		HashMap<Integer,Integer>mp=new HashMap<>();
		q.add(new AbstractMap.SimpleEntry<>(root,0));
		while(!q.isEmpty()) {
			Node temp=q.peek().getKey();
			int hd=q.peek().getValue();
			q.poll();
			if(!mp.containsValue(hd))mp.put(hd, temp.data);
			if(temp.left!=null) {
				q.add(new AbstractMap.SimpleEntry<>(root.left,hd-1));
			}
			if(temp.right!=null) {
				q.add(new AbstractMap.SimpleEntry<>(root.right,hd+1));
			}
		}
		
		for(Integer x :  mp.values()) {
			ans.add(x);
		}
		return ans;
		
	}
	}
